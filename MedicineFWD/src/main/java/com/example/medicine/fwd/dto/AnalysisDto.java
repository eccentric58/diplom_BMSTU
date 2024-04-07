package com.example.medicine.fwd.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AnalysisDto {
    private final double FVC; // Объем форсированного выдоха
    private final double FEV1; // Форсированный объем выдоха за 1 секунду
    private final double PEF; // Пиковая скорость выдоха
    private final double ELA; // Эластичность легких
    private final double FEV2575; // Форсированный объем выдоха между 25% и 75% ФВЦ
    private final double FET; // Время форсированного выдоха
    private final double EVol; // Объем выдоха
    private final double FIVc; // Форсированный инспираторный витальный объем


//    public void patientAnalyze() {
//        Patient patient = new Patient("Igor", 23, "M", "123123", );
//        // Анализ FVC
//        if (FVC < 80.0) {
//            patient.report.add("FVC ниже нормы. Возможное ограничение функции легких.");
//        } else {
//            patient.report.add("FVC в пределах нормы.");
//        }
//
//        // Анализ FEV1
//        double fev1Percentage = (FEV1 / FVC) * 100;
//        if (FEV1 < 80.0) {
//            patient.report.add("FEV1 ниже нормы. Возможная обструкция дыхательных путей.");
//        } else if (fev1Percentage < 70) {
//            patient.report.add("Отношение FEV1/FVC ниже 70%, указывает на обструктивное заболевание легких.");
//        } else {
//            patient.report.add("FEV1 в пределах нормы.");
//        }
//
//        // Анализ PEF
//        if (PEF < 50.0) {
//            patient.report.add("PEF значительно ниже нормы. Тяжелая обструкция.");
//        } else if (PEF < 80.0) {
//            patient.report.add("PEF ниже нормы. Умеренная обструкция.");
//        } else {
//            patient.report.add("PEF в пределах нормы.");
//        }
//
//        // Анализ ELA
//        if (ELA < 70.0) {
//            patient.report.add("ELA значительно ниже нормы. Указывает на уменьшение эластичности легких, возможное эмфизема.");
//        } else {
//            patient.report.add("ELA в пределах нормы.");
//        }
//
//        // Анализ FEV2575
//        if (FEV2575 < 65.0) {
//            patient.report.add("FEV25-75% ниже нормы. Возможная ранняя обструкция мелких дыхательных путей.");
//        } else {
//            patient.report.add("FEV25-75% в пределах нормы.");
//        }
//
//        // Анализ FET
//        if (FET > 8.0) {
//            patient.report.add("FET выше нормы. Возможная обструкция дыхательных путей.");
//        } else {
//            patient.report.add("FET в пределах нормы.");
//        }
//
//        // Анализ EVol
//        if (EVol < 2.0) {
//            patient.report.add("EVol ниже нормы. Указывает на тяжелую обструкцию.");
//        } else {
//            patient.report.add("EVol в пределах нормы.");
//        }
//
//        // Анализ FIVc
//        if (FIVc < 80.0) {
//            patient.report.add("FIVc ниже нормы. Возможное ограничение функции легких или слабость дыхательных мышц.");
//        } else {
//            patient.report.add("FIVc в пределах нормы.");
//        }
//
//        return patient.report;
//    }
}
