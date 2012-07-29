# http://www.pythonchallenge.com/pc/def/channel.html

import libs.web as web
import re
import zipfile
import collections
import pprint
import string

url = 'http://www.pythonchallenge.com/pc/def/channel.html'
src = web.get_page_source(url)
print(src)

print('================================')
print('================================')

# goto and download: http://www.pythonchallenge.com/pc/def/channel.zip

zf = '/Users/Aphrodite/Downloads/channel.zip'
with zipfile.ZipFile(zf) as fd:
    msg = fd.read('readme.txt')
    print msg

print('================================')

with zipfile.ZipFile(zf) as fd:
    num = '90052'
    while True:
        msg = fd.read(num + '.txt')
        print msg
        match = re.search(r'\d+$', msg)
        if not match:
            break
        else:
            num = match.group()

print('================================')

with zipfile.ZipFile(zf) as fd:
    num = '90052'
    comments = []
    while True:
        file_name = num + '.txt'
        msg = fd.read(file_name)
        print msg
        comments.append(fd.getinfo(file_name).comment)
        match = re.search(r'\d+$', msg)
        if not match:
            break
        else:
            num = match.group()
    print comments

print('================================')

print ''.join(comments)

# hockey
# oxygen
# http://www.pythonchallenge.com/pc/def/oxygen.html
