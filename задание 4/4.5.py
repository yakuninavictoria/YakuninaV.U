# -*- coding: utf-8 -*-
s=input()
if s.count('f') == 1:
	print(s.find('f'))
elif s.count('f')>=0:
	print(s.find('f')+s.rfind('f'))