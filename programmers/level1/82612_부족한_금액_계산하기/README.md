# 부족한 금액 계산하기 (82612)

- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/82612
- 난이도: Lv.1

## 문제 요약
놀이기구 이용료는 매 이용마다 증가한다. 기본료가 `price`일 때 `i`번째 이용료는 `price * i`이다.
`count`번 이용하려는 고객이 가진 돈이 `money`일 때, 부족한 금액을 반환한다. 부족하지 않으면 0을 반환한다.

## 접근
- `i`를 1부터 `count`까지 늘려가며 `price * i`를 누적해 총 이용료(`total`)를 구한다.
- `total`이 `money`보다 크거나 같으면 부족액은 없으므로 0을 반환한다.
- `total`이 `money`보다 작으면 `total - money`(부족액)를 반환한다.
- `count`가 커지면 총합이 `int` 범위를 넘을 수 있어 `long`으로 계산한다.

## 복잡도
- 시간복잡도: O(count) — 1부터 count까지 한 번씩 순회.
- 공간복잡도: O(1).
