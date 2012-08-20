# http://www.pythonchallenge.com/pc/def/oxygen.html

import libs.web as web
import urllib
import Image

url = 'http://www.pythonchallenge.com/pc/def/oxygen.html'
src = web.get_page_source(url)
print(src)

print('================================')
print('================================')

oxygen_file = '/tmp/oxygen.png'
png_url = 'http://www.pythonchallenge.com/pc/def/oxygen.png'
filename, msg = urllib.urlretrieve(png_url, oxygen_file)
print filename, msg

print('================================')

image = Image.open(oxygen_file)
print image.format, image.size, image.mode

print('================================')

y_begin = 0
while y_begin < image.size[1]:
    pix = image.getpixel((0, y_begin))
    if pix[0] == pix[1] == pix[2]:
        break
    y_begin += 1

print 'y_begin: ', y_begin

x_end = 0
while x_end < image.size[0]:
    pix = image.getpixel((x_end, y_begin))
    if pix[0] == pix[1] == pix[2]:
        x_end += 1
    else:
        break

print 'x_end: ', x_end

print('================================')

msg = map(lambda x: image.getpixel((x, y_begin))[0], filter(lambda x: image.getpixel((x, y_begin)) != image.getpixel((x + 1, y_begin)), xrange(x_end)))
print msg

print('================================')

print ''.join(chr(x) for x in msg)

print('================================')

print ''.join(chr(x) for x in [105, 110, 116, 101, 103, 114, 105, 116, 121])

# integrity
# http://www.pythonchallenge.com/pc/def/integrity.html