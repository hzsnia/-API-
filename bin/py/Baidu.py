# -*- coding:utf-8  -*-


import http.client
import hashlib
import urllib
import random
import json

import sys

class Core:
    def __init__(self):
        self.appid = sys.argv[4]  # 填写你的appid
        self.secretKey = sys.argv[5]  # 填写你的密钥
        self.httpClient = None
        self.myurl = '/api/trans/vip/translate'
        self.fromLang = sys.argv[2]   #原文语种
        self.toLang = sys.argv[3]
        
        self.q=sys.argv[1]

    def translate(self):
        salt = random.randint(32768, 65536)
        sign = self.appid + self.q + str(salt) + self.secretKey
        sign = hashlib.md5(sign.encode()).hexdigest()
        up = self.myurl + '?appid=' + self.appid + '&q=' + urllib.parse.quote(
        self.q) + '&from=' + self.fromLang + '&to=' + self.toLang + '&salt=' + str(salt) + '&sign=' + sign

        try:
            self.httpClient = http.client.HTTPConnection('api.fanyi.baidu.com')
            self.httpClient.request('GET', up)
            response = self.httpClient.getresponse()
            result_all = response.read().decode("utf-8")
            result = json.loads(result_all)
            useresult = result['trans_result'][0]['dst']
            
            print(useresult)
            
        except Exception as e:
            print (e)
        finally:
            if self.httpClient:
                self.httpClient.close()

if __name__ == '__main__':
    core = Core()
    core.translate()