import libs.web as web


if __name__ == '__main__':
#    url = 'http://www.linux-ren.org'
    url = 'http://www.pythonchallenge.com/pc/def/ocr.html'
    # url = 'http://172.16.82.245'
    src = web.get_page_source(url)
    print(src)
    print('================================')
    comment = web.get_page_comment(url)
    print(len(comment))
    msg = web.get_message(comment, 1)
    print(msg)