# http://www.pythonchallenge.com/pc/def/map.html

import libs.web as web
import re
import string

url = 'http://www.pythonchallenge.com/pc/def/map.html'
src = web.get_page_source(url)
print(src)

print('================================')

msg = re.search(r'<font color="#f000f0">(.*?)</tr>', src, re.S).group(1)
print msg

print('================================')

print msg.translate(string.maketrans(string.lowercase, string.lowercase[2:] + string.lowercase[:2]))

print('================================')

print 'map'.translate(string.maketrans(string.lowercase, string.lowercase[2:] + string.lowercase[:2]))

# ocr
# http://www.pythonchallenge.com/pc/def/ocr.html