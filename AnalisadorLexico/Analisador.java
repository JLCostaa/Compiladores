public class Analisador {
    Entrada ent;

    public Analisador(String arquivo) {
        this.ent = new Entrada(arquivo);
    }

    public Token proximoToken() {
        // ignorar espaço em branco, quando is read retornar -1 é porque acabou a leitra
        // dos caracteres

        int caractereLido = -1;

        while ((caractereLido = ent.LerProximoCaractere()) != -1) {
            char c = (char) caractereLido;
            if (c == ' ' || c == '\n')
                continue;

            // teste
            // token com unico caractere

            if (c == ':') {
                return new Token(TipoToken.Delim, ":");
            } else if (c == '*') {
                return new Token(TipoToken.OprAriMult, "*");
            }
            // relacional (implementar uma logica para 2 caracteres)
            else if (c == '<') {
                c = (char) ent.LerProximoCaractere();

                if (c == '>') {
                    return new Token(TipoToken.OpRelDif, "<>");
                } else if (c == '=') {
                    return new Token(TipoToken.OpRelMenorIgual, "<=");
                } else {
                    return new Token(TipoToken.OpRelMenor, "<");
                }

            }
            if (c == '/') {
                return new Token(TipoToken.OprAriDiv, "/");
            } else if (c == '-') {
                return new Token(TipoToken.OprAriSub, "-");
            } else if (c == '+') {
                return new Token(TipoToken.OpAritSoma, "+");
            } else if (c == '(') {
                return new Token(TipoToken.AbrePar, "(");
            } else if (c == ')') {
                return new Token(TipoToken.FechaPar, ")");
            } else if (c == '=') {
                return new Token(TipoToken.OpRelIgual, "=");
            } else if (c == '=') {
                c = (char) ent.LerProximoCaractere();
                if (c == '=') {
                    return new Token(TipoToken.OpRelIgual, "==");
                } else {
                    return new Token(TipoToken.PCAtribuir, "=");
                }
            } else if (c == 's') {
                if (c == 'e')
                    return new Token(TipoToken.PCSe, "se");
            } else if (c == '}') {
                return new Token(TipoToken.Fim, "}");        
            }else  if (c == '|') {
                return new Token(TipoToken.OpCompOu, "|");        
            }
            
        }
        return null;
    }
}
