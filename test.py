#!/bin/python
import random
def main():
    if random.random() > 0.5:
        exit(0)
    else:
        exit(1)

main()