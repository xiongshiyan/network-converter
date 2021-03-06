package top.jfunc.common.http.withconverter.json;

import top.jfunc.common.converter.Converter;
import top.jfunc.common.converter.JsonConverter;
import top.jfunc.common.http.withconverter.ConverterApacheSmartHttpClient;
import top.jfunc.json.JsonArray;
import top.jfunc.json.JsonObject;

import java.util.Objects;

/**
 * 返回结果String转换为Json
 * @author 熊诗言2017/12/01
 */
public class JsonConverterApacheSmartHttpClient extends ConverterApacheSmartHttpClient implements JsonConverterSmartHttpClient {

    private JsonConverter converter;
    public JsonConverterApacheSmartHttpClient(JsonConverter converter){
        super(converter);
        this.converter = Objects.requireNonNull(converter);
    }
    public JsonConverterApacheSmartHttpClient(){}

    @Override
    public JsonConverterSmartHttpClient setConverter(JsonConverter converter) {
        super.setConverter(converter);
        this.converter = Objects.requireNonNull(converter);
        return this;
    }

    @Override
    public JsonObject convertJsonObject(String src) {
        Converter.checkNull(this.converter);
        return this.converter.convertJsonObject(src);
    }

    @Override
    public JsonArray convertJsonArray(String src) {
        Converter.checkNull(this.converter);
        return this.converter.convertJsonArray(src);
    }
}
