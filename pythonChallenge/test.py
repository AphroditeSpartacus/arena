# import libs.web as web
import re
import pprint
import os

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


def main():
    url = 'http://172.16.82.245/asianux-rpm-download/asianux4/x86_64/pool/RPMS/'
    ax4_rpm = get_page_source(url)
    print(ax4_rpm)

    rpms = filter(lambda x: x.endswith('rpm'), re.findall('<a href="(.*?)">', ax4_rpm, re.S))
    print len(rpms)
    pprint.pprint(rpms)
    for x in rpms:
        if not os.path.exists(x):
            command = 'wget %s' % url + x
            print command
            os.system(command)
    # url = 'http://172.16.82.245/asianux-rpm-download/asianux4/x86_64/pool/RPMS/'
    # src = web.get_page_source(url)
    # print(src)


if __name__ == '__main__':
    main()