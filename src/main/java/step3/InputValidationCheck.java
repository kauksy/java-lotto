package step3;

import java.util.*;

public class InputValidationCheck {

    public static void checkEmpty(String cash) {
        if (cash.isEmpty())
            throw new IllegalArgumentException("구매금액이 없으면, 로또구매가 불가합니다.");
    }

    public static void checkCash(String cash) {
        if (Integer.parseInt(cash) < Lotto.LOTTO_PRICE)
            throw new IllegalArgumentException("로또는 1장에 " + Lotto.LOTTO_PRICE + " 원 입니다.");
    }

    public static void checkWinningNumberLength(String[] trimWinningNumbers) {
        if (trimWinningNumbers.length != LottoGenerator.WINNING_NUMBERS_LENGTH)
            throw new IllegalArgumentException("당첨번호는" + LottoGenerator.WINNING_NUMBERS_LENGTH + "개를 입력하셔야 합니다.");
    }

    public static int[] checkWinningNumberRange(String[] trimWinningNumbers) {
        int[] winningNumbers = new int[LottoGenerator.WINNING_NUMBERS_LENGTH];
        for (int i = 0; i < LottoGenerator.WINNING_NUMBERS_LENGTH; i++) {
            winningNumbers[i] = Integer.parseInt((trimWinningNumbers[i]));
            checkEachWinningNumber(winningNumbers[i]);
        }

        return winningNumbers;
    }

    public static void checkOverlapWinningNumber(String[] winningNumbers) {
        Set<String> uniqueWinningNumber = new HashSet<>(Arrays.asList(winningNumbers));
        if (uniqueWinningNumber.size() != winningNumbers.length)
            throw new IllegalArgumentException("당첨번호에 중복된 값이 있습니다.");
    }

    public static void checkBonusNumber(List<Integer> inputWinningNumberList) {
        checkEachWinningNumber(Lotto.LOTTO_BONUS_NUMBER);
        for (int winningNumber : inputWinningNumberList) {
            checkOverlapBonusNumber(winningNumber);
        }
    }

    public static void checkEachWinningNumber(int bonusNumber) {
        if (bonusNumber > Lotto.LOTTO_NUMBER_MAX || bonusNumber < Lotto.LOTTO_NUMBER_MIN)
            throw new IllegalArgumentException("당첨번호와 보너스 볼은 " + Lotto.LOTTO_NUMBER_MIN + " ~ " + Lotto.LOTTO_NUMBER_MAX + "사이로 입력하셔야 합니다.");
    }

    public static void checkOverlapBonusNumber(int winningNumber) {
        if (winningNumber == Lotto.LOTTO_BONUS_NUMBER)
            throw new IllegalArgumentException("입력 된 당첨번호 중에 보너스 번호와 중복되는 값이 있습니다.");
    }
}