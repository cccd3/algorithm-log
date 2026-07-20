from collections import Counter


def solution(participant, completion):
    counter = Counter(participant) - Counter(completion)
    return next(iter(counter))


if __name__ == "__main__":
    print(solution(["leo", "kiki", "eden"], ["eden", "kiki"]))  # leo
    print(solution(["mislav", "stanko", "mislav", "ana"],
                   ["stanko", "ana", "mislav"]))  # mislav
