#!/bin/python
import random
def main():
    if random.random() > 0.2:
        exit(0)
    else:
        exit(1)

main()