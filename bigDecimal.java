import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class bigDecimal {

    public static void main(String[] args) {

        // إنشاء BigDecimal من نص (أدق طريقة)
        BigDecimal a = new BigDecimal("123.456");
        BigDecimal b = new BigDecimal("7.89");
        BigDecimal neg = new BigDecimal("-25.50");

        // 1️⃣ الجمع
        System.out.println("add: " + a.add(b));
        // يضيف a + b

        // 2️⃣ الطرح
        System.out.println("subtract: " + a.subtract(b));
        // يطرح b من a

        // 3️⃣ الضرب
        System.out.println("multiply: " + a.multiply(b));
        // يضرب a * b

        // 4️⃣ القسمة مع تحديد الدقة (scale = 3)
        System.out.println("divide: " + a.divide(b, 3, RoundingMode.HALF_UP));
        // يقسم a / b ويقرب إلى 3 منازل عشرية

        // 5️⃣ باقي القسمة
        System.out.println("remainder: " + a.remainder(b));
        // يحسب باقي القسمة (a % b)

        // 6️⃣ رفع الرقم للقوة 2
        System.out.println("pow(2): " + a.pow(2));
        // a²

        // 7️⃣ الجذر التربيعي (من Java 9)
        System.out.println("sqrt: " + a.sqrt(new MathContext(6, RoundingMode.HALF_UP)));
        // الجذر التربيعي لـ a بدقة 6 خانات

        // 8️⃣ القيمة المطلقة
        System.out.println("abs: " + neg.abs());
        // يحول الرقم السالب إلى موجب

        // 9️⃣ عكس الإشارة
        System.out.println("negate: " + a.negate());
        // يجعل الرقم سالبًا

        // 🔟 المقارنة بين رقمين
        System.out.println("compareTo: " + a.compareTo(b));
        // ترجع -1 لو a < b ، 0 لو متساويين ، 1 لو a > b

        // 11️⃣ الحد الأدنى والأقصى
        System.out.println("min: " + a.min(b)); // الأصغر
        System.out.println("max: " + a.max(b)); // الأكبر

        // 12️⃣ فحص الإشارة
        System.out.println("signum: " + neg.signum());
        // -1 لو سالب، 0 لو صفر، 1 لو موجب

        // 13️⃣ عدد الأرقام بعد العلامة العشرية
        System.out.println("scale: " + a.scale());
        // في 123.456 → الناتج 3

        // 14️⃣ إجمالي عدد الأرقام (قبل وبعد الفاصلة)
        System.out.println("precision: " + a.precision());
        // في 123.456 → الناتج 6

        // 15️⃣ ضبط عدد المنازل العشرية
        System.out.println("setScale(2, HALF_UP): " + a.setScale(2, RoundingMode.HALF_UP));
        // يحدد أن الرقم له منزلتين عشريتين ويقرب

        // 16️⃣ التقريب (round)
        System.out.println("round: " + a.round(new MathContext(4, RoundingMode.DOWN)));
        // يقلل الدقة إلى 4 أرقام كلية (يقص الباقي)

        // 17️⃣ إزالة الأصفار الزائدة
        BigDecimal c = new BigDecimal("123.45000");
        System.out.println("stripTrailingZeros: " + c.stripTrailingZeros());
        // يحذف الأصفار بعد العلامة

        // 18️⃣ تحريك العلامة العشرية لليمين ×10^2
        System.out.println("movePointRight(2): " + a.movePointRight(2));
        // 123.456 → 12345.6

        // 19️⃣ تحريك العلامة العشرية لليسار ÷10^2
        System.out.println("movePointLeft(2): " + a.movePointLeft(2));
        // 123.456 → 1.23456

        // 20️⃣ الضرب في 10^n مباشرة
        System.out.println("scaleByPowerOfTen(3): " + a.scaleByPowerOfTen(3));
        // 123.456 × 1000 = 123456

        // 21️⃣ أقل وحدة ممكنة للرقم (مثل 0.001)
        System.out.println("ulp: " + a.ulp());
        // وحدة آخر خانة عشرية = 0.001

        // 22️⃣ تحويل بدون صيغة علمية (no E notation)
        System.out.println("toPlainString: " + new BigDecimal("1E+6").toPlainString());
        // "1000000"

        // 23️⃣ تحويل إلى صيغة هندسية
        System.out.println("toEngineeringString: " + new BigDecimal("1E+6").toEngineeringString());
        // "1E+6" لكن بطريقة هندسية مفهومة

        // 24️⃣ تحويل إلى عدد صحيح (يحذف الكسور)
        System.out.println("toBigInteger: " + a.toBigInteger());
        // 123

        // 25️⃣ التحويل لأنواع بدائية
        System.out.println("intValue: " + a.intValue());   // 123
        System.out.println("longValue: " + a.longValue()); // 123
        System.out.println("doubleValue: " + a.doubleValue()); // 123.456

        // 26️⃣ إنشاء BigDecimal من رقم صحيح
        System.out.println("valueOf: " + BigDecimal.valueOf(12345, 2));
        // يعطي 123.45 (القيمة ÷ 10^2)

        // 27️⃣ القسمة وإرجاع خارج القسمة والباقي معًا
        BigDecimal[] divRem = a.divideAndRemainder(b);
        System.out.println("Quotient: " + divRem[0] + ", Remainder: " + divRem[1]);
        // يعرض الناتج والباقي

        // 28️⃣ القسمة الصحيحة فقط
        System.out.println("divideToIntegralValue: " + a.divideToIntegralValue(b));
        // يعطي الجزء الصحيح فقط من القسمة

        // 29️⃣ القيم الثابتة الجاهزة
        System.out.println("ZERO: " + BigDecimal.ZERO); // 0
        System.out.println("ONE: " + BigDecimal.ONE);   // 1
        System.out.println("TEN: " + BigDecimal.TEN);   // 10

        // 30️⃣ فحص المساواة (يأخذ في الاعتبار scale)
        System.out.println("equals: " + new BigDecimal("2.0").equals(new BigDecimal("2.00")));
        // false لأن scale مختلف

        // 31️⃣ فحص القيمة بدون الاهتمام بالـ scale
        System.out.println("compareTo (value only): " + new BigDecimal("2.0").compareTo(new BigDecimal("2.00")));
        // 0 لأن القيم متساوية رياضيًا
    }}
