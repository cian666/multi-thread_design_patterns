package cn.cian.base.a12_2.activeObject;

class RealResult<T> extends Result<T> {
    private final T resultValue;

    public RealResult(T resultValue) {
        this.resultValue = resultValue;
    }

    public T getResultValue() {
        return resultValue;
    }
}