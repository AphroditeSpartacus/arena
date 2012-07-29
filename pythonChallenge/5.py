# http://www.pythonchallenge.com/pc/def/peak.html

import libs.web as web
import pickle

url = 'http://www.pythonchallenge.com/pc/def/peak.html'
src = web.get_page_source(url)
print(src)

print('================================')
print('================================')

peakhell = web.get_page_source('http://www.pythonchallenge.com/pc/def/banner.p')
print peakhell

print('================================')

obj = pickle.loads(peakhell)
print type(obj)

print('================================')

print obj

print('================================')

# for x in obj:
#     print ''.join(char * n for char, n in x)

print '\n'.join(''.join(char * cnt for char, cnt in x) for x in obj)

# channel
# http://www.pythonchallenge.com/pc/def/channel.html