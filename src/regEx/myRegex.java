package regEx;

//    C помощью регулярных выражений найдите (3 задания отдельно)
//            а) все булеан переменные
//            б) версию приложения (версия - любое число, находится в поле version)
//            в) Находит все поля, в названии которых есть слово "normalizer"
//"indexpatterns": [
//        "couriersalary.syntheticaddress-*"
//        ],
//        "version": 69,
//        "settings": {
//        "index": {
//        "mapping": {
//        "coerce": false,
//        "ignoremalformed": true,
//        "totalfields.limit": 100
//        },
//        "codec": "bestcompression",
//        "numberofshards": 6
//        },
//        "analysis": {
//        "normalizer": {
//        "lowercasenormalizer": {
//        "type": "custom",
//        "charfilter": [],
//        "filter": [
//        "lowercase",
//        "asciifolding"
//        ]
//        }
//        }
//        }
//        },

import java.util.regex.Pattern;

public class myRegex {
    public static void main(String[] args) {

        String regexBoolean = "[a-zA-Z\"]+(?=: (false|true))";
        String regexVersion = "(?<=\"version\": )[0-9]+";
        String regexNormalizer = ".*(normalizer).*";
        Pattern patternBoolean = Pattern.compile(regexBoolean);
        Pattern patternVersion = Pattern.compile(regexVersion);
        Pattern patternNormalizer = Pattern.compile(regexNormalizer);


    }

}
