package by.it.zeynalov.jd01_09_matlab;


public class VarF extends Var {
    public Double value;

    @Override
    public Var add(Var var) {
        if (var instanceof VarF) {
            VarF operand = (VarF) var;
            return new VarF(this.value + operand.value); //this.value - текущее число, operand.value - число которое подали
        } else
            return (var.add(this));
    }

    // {1,2,3} add 10
    // 10 add {1,2,3}

    @Override
    public Var sub(Var var) {
        if (var instanceof VarF) {
            VarF operand = (VarF) var;
            return new VarF(this.value - operand.value);
        } else
            return super.sub(var);
    }

    @Override
    public Var mul(Var var) {
        if (var instanceof VarF) {
            VarF operand = (VarF) var;
            return new VarF(this.value * operand.value);
        } else
            return var.mul(this);
    }

    @Override
    public Var div(Var var) {
        if (var instanceof VarF) {
            VarF operand = (VarF) var;
            return new VarF(this.value / operand.value);
        } else
            return super.div(var);
    }


    public VarF(String value) {
        fromString(value);
    }

    public VarF(double value) {
        this.value = value;
    }

    public VarF(VarF var) {
        this.value = var.value;
    }

    @Override
    public void fromString(String value) {
        this.value = Double.parseDouble(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
