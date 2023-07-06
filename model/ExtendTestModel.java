package model;

public class ExtendTestModel<T extends LowLevelModel> {
    private T extendsModel;
    private String name;

    public ExtendTestModel(T extendsModel, String name) {
        this.extendsModel = extendsModel;
        this.name = name;
    }

    public ExtendTestModel(T extendsModel) {
        this.extendsModel = extendsModel;
    }

    public T getExtendsModel() {
        return extendsModel;
    }

    public void setExtendsModel(T extendsModel) {
        this.extendsModel = extendsModel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
