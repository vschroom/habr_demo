package com.chvs.habrdemo.core.model.profile;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
enum GeneralSpeciality {

    SOFTWARE_DEVELOPMENT("Разработка"),
    QUALITY_ASSURANCE("Тестирование"),
    ADMINISTRATION("Администрирование"),
    DESIGN("Дизайн"),
    MANAGEMENT("Менеджмент"),
    ANALYTICS("Аналитика"),
    SUPPORT("Поддержка"),
    MARKETING("Маркетинг"),
    SALES("Продажи"),
    HR("HR"),
    OFFICE("Офис"),
    INFORMATION_SECURITY("Информационная безопасность"),
    ARTIFICIAL_INTELLIGENCE("Искуственный интелект");

    private final String description;
}
