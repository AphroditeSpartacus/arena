# http://www.pythonchallenge.com/pc/def/integrity.html

import libs.web as web


url = 'http://www.pythonchallenge.com/pc/def/integrity.html'
src = web.get_page_source(url)
print(src)

print('================================')
print('================================')
