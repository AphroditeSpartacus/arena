# http://www.pythonchallenge.com/pc/def/linkedlist.php

import libs.web as web
import urllib
import re

url = 'http://www.pythonchallenge.com/pc/def/linkedlist.php'
src = web.get_page_source(url)
print(src)

print('================================')
print('================================')

base = 'http://www.pythonchallenge.com/pc/def/'
mid = 'linkedlist.php?nothing='
# num = '12345'
# num = '13115'
# num = '8022'
num = '63579'

while True:
    url = base + mid + num
    page = urllib.urlopen(url).read()
    print page
    match = re.search(r'\d+', page)
    if not match:
        break
    num = match.group()

# peak.html
# http://www.pythonchallenge.com/pc/def/peak.html