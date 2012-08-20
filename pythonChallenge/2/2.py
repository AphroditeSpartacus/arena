# http://www.pythonchallenge.com/pc/def/ocr.html

import libs.web as web
import collections
from pprint import pprint

url = 'http://www.pythonchallenge.com/pc/def/ocr.html'
src = web.get_page_source(url)
print(src)

print('================================')
print('================================')

comment = web.get_page_comment(url)
print(len(comment))
msg = web.get_message(comment, 1)
print msg

print('================================')

dd = collections.defaultdict(int)
for x in msg:
    dd[x] += 1

pprint(dd)

print('================================')

res = filter(lambda x: dd[x] == 1, msg)
print res

# equality
# http://www.pythonchallenge.com/pc/def/equality.html