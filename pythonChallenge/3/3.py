# http://www.pythonchallenge.com/pc/def/equality.html

import libs.web as web
import re

url = 'http://www.pythonchallenge.com/pc/def/equality.html'
src = web.get_page_source(url)
print(src)

print('================================')
print('================================')

comment = web.get_page_comment(url)
print(len(comment))
msg = web.get_message(comment, 0)
print msg

print('================================')

pattern = re.compile(r'(?<=(?<![A-Z])[A-Z]{3})[a-z](?=[A-Z]{3}(?![A-Z]))')
res = pattern.findall(msg)
print res
print ''.join(res)

# linkedlist
# http://www.pythonchallenge.com/pc/def/linkedlist.html