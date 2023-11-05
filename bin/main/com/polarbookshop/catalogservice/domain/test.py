def hello(x):
    y = x + 1 
    return y 

if __name__ == "__main__":
    for i in map(hello, range(100)):
        print(i)

