package com.mobile2b.webfunction;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedHashMap;

public class I18nString extends LinkedHashMap<String, String> {

    private static final String FALLBACK_LANGUAGE = "en";

    public I18nString(String lang, String string) {
        put(lang, string);
    }

    public static I18nString en(String enString) {
        return new I18nString("en", enString);
    }

    public String getLocalizedString(String lang) {
        try {
            // Try to get string in requested language
            if (StringUtils.isNotEmpty(get(lang))) {
                return get(lang);
            }
            // If not available, try to use fallback language (English)
            if (StringUtils.isNotEmpty(get(FALLBACK_LANGUAGE))) {
                return get(FALLBACK_LANGUAGE);
            }
            // If also not available, use first available string
            for (String key : keySet()) {
                if (StringUtils.isNotEmpty(get(key))) {
                    return get(key);
                }
            }
        } catch (ClassCastException e) {
            return "Invalid string";
        }
        return null;
    }

}
