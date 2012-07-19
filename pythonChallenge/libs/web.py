import re
import urllib

__author__ = 'Aphrodite'

def get_page_source(url):
    source = urllib.urlopen(url).read().decode()
    return source


def get_page_comment(url):
    source = get_page_source(url)
    return re.findall('<!--(.*?)-->', source, re.S)


def get_message(comment, index):
    return ''.join(comment[index].splitlines())


if __name__ == '__main__':
#    url = 'http://www.linux-ren.org'
    url = 'http://www.pythonchallenge.com/pc/def/ocr.html'
    src = get_page_source(url)
    print(src)
    print('===========b=====================')
    comment = get_page_comment(url)
    print(len(comment))
    msg = get_message(comment, 1)
    print(msg)