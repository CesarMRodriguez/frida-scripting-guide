.class public Lcom/blog/testfrida/examples/BasicTypes;
.super Ljava/lang/Object;
.source "BasicTypes.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addTwoBytes(BB)B
    .registers 3
    .param p0, "val1"    # B
    .param p1, "val2"    # B

    .prologue
    .line 14
    add-int v0, p0, p1

    int-to-byte v0, v0

    return v0
.end method

.method public static addTwoInts(II)I
    .registers 3
    .param p0, "val1"    # I
    .param p1, "val2"    # I

    .prologue
    .line 10
    add-int v0, p0, p1

    return v0
.end method

.method public static addTwoLongs(JJ)J
    .registers 6
    .param p0, "val1"    # J
    .param p2, "val2"    # J

    .prologue
    .line 22
    add-long v0, p0, p2

    return-wide v0
.end method

.method public static addTwoShorts(SS)S
    .registers 3
    .param p0, "val1"    # S
    .param p1, "val2"    # S

    .prologue
    .line 18
    add-int v0, p0, p1

    int-to-short v0, v0

    return v0
.end method

.method public static compareToString(Ljava/lang/String;)Z
    .registers 2
    .param p0, "hex"    # Ljava/lang/String;

    .prologue
    .line 58
    const-string v0, "hex"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static concat(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .registers 4
    .param p0, "firstString"    # Ljava/lang/String;
    .param p1, "value"    # I
    .param p2, "secondString"    # Ljava/lang/String;

    .prologue
    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static concatString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 3
    .param p0, "firstString"    # Ljava/lang/String;
    .param p1, "secondString"    # Ljava/lang/String;

    .prologue
    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static divideDouble(DD)D
    .registers 6
    .param p0, "val1"    # D
    .param p2, "val2"    # D

    .prologue
    .line 34
    div-double v0, p0, p2

    return-wide v0
.end method

.method public static divideFloat(FF)F
    .registers 3
    .param p0, "val1"    # F
    .param p1, "val2"    # F

    .prologue
    .line 30
    div-float v0, p0, p1

    return v0
.end method

.method public static getDebug()Ljava/lang/Boolean;
    .registers 2

    .prologue
    .line 126
    new-instance v0, Ljava/lang/Boolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/lang/Boolean;-><init>(Z)V

    return-object v0
.end method

.method public static getNextChar(C)C
    .registers 2
    .param p0, "char1"    # C

    .prologue
    .line 38
    add-int/lit8 v0, p0, 0x1

    int-to-char v0, v0

    return v0
.end method

.method public static getString(Ljava/lang/String;)Ljava/lang/String;
    .registers 2
    .param p0, "toFormat"    # Ljava/lang/String;

    .prologue
    .line 54
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static isCChar(C)Z
    .registers 2
    .param p0, "char1"    # C

    .prologue
    .line 42
    const/16 v0, 0x63

    if-ne p0, v0, :cond_6

    const/4 v0, 0x1

    :goto_5
    return v0

    :cond_6
    const/4 v0, 0x0

    goto :goto_5
.end method

.method public static multiply(BB)B
    .registers 3
    .param p0, "val1"    # B
    .param p1, "val2"    # B

    .prologue
    .line 66
    mul-int v0, p0, p1

    int-to-byte v0, v0

    return v0
.end method

.method public static multiply(FF)F
    .registers 3
    .param p0, "val1"    # F
    .param p1, "val2"    # F

    .prologue
    .line 78
    mul-float v0, p0, p1

    return v0
.end method

.method public static multiply(Lcom/blog/testfrida/complexobjects/Person;F)F
    .registers 3
    .param p0, "val1"    # Lcom/blog/testfrida/complexobjects/Person;
    .param p1, "val2"    # F

    .prologue
    .line 118
    const/high16 v0, 0x41400000    # 12.0f

    return v0
.end method

.method public static multiply(Ljava/util/List;F)F
    .registers 3
    .param p1, "val2"    # F
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;F)F"
        }
    .end annotation

    .prologue
    .line 122
    .local p0, "val1":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/high16 v0, 0x41400000    # 12.0f

    return v0
.end method

.method public static multiply([BB)F
    .registers 3
    .param p0, "val1"    # [B
    .param p1, "val2"    # B

    .prologue
    .line 82
    const/high16 v0, 0x41400000    # 12.0f

    return v0
.end method

.method public static multiply([CC)F
    .registers 3
    .param p0, "val1"    # [C
    .param p1, "val2"    # C

    .prologue
    .line 110
    const/high16 v0, 0x41400000    # 12.0f

    return v0
.end method

.method public static multiply([DD)F
    .registers 4
    .param p0, "val1"    # [D
    .param p1, "val2"    # D

    .prologue
    .line 102
    const/high16 v0, 0x41400000    # 12.0f

    return v0
.end method

.method public static multiply([FF)F
    .registers 3
    .param p0, "val1"    # [F
    .param p1, "val2"    # F

    .prologue
    .line 98
    const/high16 v0, 0x41400000    # 12.0f

    return v0
.end method

.method public static multiply([II)F
    .registers 3
    .param p0, "val1"    # [I
    .param p1, "val2"    # I

    .prologue
    .line 86
    const/high16 v0, 0x41400000    # 12.0f

    return v0
.end method

.method public static multiply([JJ)F
    .registers 4
    .param p0, "val1"    # [J
    .param p1, "val2"    # J

    .prologue
    .line 94
    const/high16 v0, 0x41400000    # 12.0f

    return v0
.end method

.method public static multiply([Lcom/blog/testfrida/complexobjects/Person;Lcom/blog/testfrida/complexobjects/Person;)F
    .registers 3
    .param p0, "val1"    # [Lcom/blog/testfrida/complexobjects/Person;
    .param p1, "val2"    # Lcom/blog/testfrida/complexobjects/Person;

    .prologue
    .line 106
    const/high16 v0, 0x41400000    # 12.0f

    return v0
.end method

.method public static multiply([SS)F
    .registers 3
    .param p0, "val1"    # [S
    .param p1, "val2"    # S

    .prologue
    .line 90
    const/high16 v0, 0x41400000    # 12.0f

    return v0
.end method

.method public static multiply([[II)F
    .registers 3
    .param p0, "val1"    # [[I
    .param p1, "val2"    # I

    .prologue
    .line 114
    const/high16 v0, 0x41400000    # 12.0f

    return v0
.end method

.method public static multiply(II)I
    .registers 3
    .param p0, "val1"    # I
    .param p1, "val2"    # I

    .prologue
    .line 62
    mul-int v0, p0, p1

    return v0
.end method

.method public static multiply(JJ)J
    .registers 6
    .param p0, "val1"    # J
    .param p2, "val2"    # J

    .prologue
    .line 74
    mul-long v0, p0, p2

    return-wide v0
.end method

.method public static multiply(SS)S
    .registers 3
    .param p0, "val1"    # S
    .param p1, "val2"    # S

    .prologue
    .line 70
    mul-int v0, p0, p1

    int-to-short v0, v0

    return v0
.end method

.method public static negate(Z)Z
    .registers 2
    .param p0, "value"    # Z

    .prologue
    .line 26
    if-nez p0, :cond_4

    const/4 v0, 0x1

    :goto_3
    return v0

    :cond_4
    const/4 v0, 0x0

    goto :goto_3
.end method
