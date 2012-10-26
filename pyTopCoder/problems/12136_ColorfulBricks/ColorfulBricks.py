#!/usr/bin/env python

from __future__ import absolute_import
from __future__ import division
from __future__ import generators
from __future__ import nested_scopes
from __future__ import print_function
from __future__ import with_statement

import bisect
import collections
import copy
import functools
import heapq
import itertools
import math
import operator
import os
import re
import random
import sys
import unittest
from pprint import pprint
from StringIO import StringIO

__author__ = 'Aphrodite'


def countLayouts(bricks):
    d = {}
    for x in bricks:
        d[x] = d.get(x, 0) + 1
    if len(d) == 1:
        return 1
    elif len(d) == 2:
        return 2
    else:
        return 0
