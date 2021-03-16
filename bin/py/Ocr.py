from aip import AipOcr
import sys,os
os.chdir(sys.path[0])

class Ocr:
    def __init__(self):
        self.APP_id = "19710329"
        self.AK = "X6mv4Vr89HNWGGGs336GSMUz"
        self.SK = "fm9O3ye2khu7Aqvqlp87AOeuECCu1LtS"
        self.clent = AipOcr(self.APP_id,self.AK,self.SK)
        self.address = sys.argv[1]

    def get_file_content(self,filePath):
        with open(filePath,'rb') as fp:
            return fp.read()
    
    def getimage(self):
        self.image = self.get_file_content(self.address)

    def getresult(self):
        result = self.clent.accurate(self.image)
        result = result['words_result'][0]['words']
        print(result)

if __name__ == '__main__':
    ocr = Ocr()
    ocr.get_file_content('example.jpg')
    ocr.getimage()
    ocr.getresult()




 

