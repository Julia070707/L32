package l32;

import java.util.Scanner;

enum MoonPhases {
    NEW_MOON("0%"),
    WAXING_CRESCENT("14%"),
    FIRST_QUARTER("25%"),
    WAXING_GIBBOUS("50%"),
    FULL_MOON("100%"),
    WANING_GIBBOUS("50%"),
    LAST_QUARTER("25%"),
    WANING_CRESCENT("14%");

    private final String illumination; // свойство для показа освещенности

    MoonPhases(String illumination) {
        this.illumination = illumination;
    }

    public String getIllumination() {
        return illumination;
    }
}

public class Main4 {
    public static void main(String[] args) {
        // вывод всех значений MoonPhases
        for (MoonPhases moonPhase : MoonPhases.values()) {
            System.out.println(moonPhase + ": Illumination - " + moonPhase.getIllumination());
        }

        // MoonPhases на основе пользовательского ввода
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фазу луны (например, FULL_MOON): ");
        String userInput = scanner.nextLine();

        MoonPhases selectedMoonPhase;

        try {
            selectedMoonPhase = MoonPhases.valueOf(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректная фаза луны. Выбрана фаза по умолчанию.");
            selectedMoonPhase = MoonPhases.NEW_MOON;
        }

        // switch
        switch (selectedMoonPhase) {
            case NEW_MOON:
                System.out.println("новолуние: " + selectedMoonPhase.getIllumination());
                break;
            case FULL_MOON:
                System.out.println("полнолуние: " + selectedMoonPhase.getIllumination());
                break;
            default:
                System.out.println("фаза другая: " + selectedMoonPhase.getIllumination());
        }

        // Закрываем Scanner
        scanner.close();
    }
}
