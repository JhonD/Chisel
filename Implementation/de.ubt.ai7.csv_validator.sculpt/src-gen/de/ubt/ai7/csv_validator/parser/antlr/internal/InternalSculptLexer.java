package de.ubt.ai7.csv_validator.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSculptLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalSculptLexer() {;} 
    public InternalSculptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSculptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSculpt.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:11:7: ( 'DELIMITERS' )
            // InternalSculpt.g:11:9: 'DELIMITERS'
            {
            match("DELIMITERS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:12:7: ( 'TYPES' )
            // InternalSculpt.g:12:9: 'TYPES'
            {
            match("TYPES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:13:7: ( 'TOKENS' )
            // InternalSculpt.g:13:9: 'TOKENS'
            {
            match("TOKENS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:14:7: ( 'REGIONS' )
            // InternalSculpt.g:14:9: 'REGIONS'
            {
            match("REGIONS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:15:7: ( 'RULES' )
            // InternalSculpt.g:15:9: 'RULES'
            {
            match("RULES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:16:7: ( 'TRANSFORMATION PROGRAM' )
            // InternalSculpt.g:16:9: 'TRANSFORMATION PROGRAM'
            {
            match("TRANSFORMATION PROGRAM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:17:7: ( 'Row delim' )
            // InternalSculpt.g:17:9: 'Row delim'
            {
            match("Row delim"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:18:7: ( '=' )
            // InternalSculpt.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:19:7: ( ';' )
            // InternalSculpt.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:20:7: ( 'Col delim' )
            // InternalSculpt.g:20:9: 'Col delim'
            {
            match("Col delim"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:21:7: ( 'List delim' )
            // InternalSculpt.g:21:9: 'List delim'
            {
            match("List delim"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:22:7: ( ':' )
            // InternalSculpt.g:22:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:23:7: ( 'base' )
            // InternalSculpt.g:23:9: 'base'
            {
            match("base"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:24:7: ( 'format' )
            // InternalSculpt.g:24:9: 'format'
            {
            match("format"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:25:7: ( 'decimalChar' )
            // InternalSculpt.g:25:9: 'decimalChar'
            {
            match("decimalChar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:26:7: ( 'groupChar' )
            // InternalSculpt.g:26:9: 'groupChar'
            {
            match("groupChar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:27:7: ( 'length' )
            // InternalSculpt.g:27:9: 'length'
            {
            match("length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:28:7: ( 'minLength' )
            // InternalSculpt.g:28:9: 'minLength'
            {
            match("minLength"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:29:7: ( 'maxLength' )
            // InternalSculpt.g:29:9: 'maxLength'
            {
            match("maxLength"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:30:7: ( 'minimum' )
            // InternalSculpt.g:30:9: 'minimum'
            {
            match("minimum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:31:7: ( 'minInclusive' )
            // InternalSculpt.g:31:9: 'minInclusive'
            {
            match("minInclusive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:32:7: ( 'maximum' )
            // InternalSculpt.g:32:9: 'maximum'
            {
            match("maximum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:33:7: ( 'maxInclusive' )
            // InternalSculpt.g:33:9: 'maxInclusive'
            {
            match("maxInclusive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:34:7: ( 'minExclusive' )
            // InternalSculpt.g:34:9: 'minExclusive'
            {
            match("minExclusive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:35:7: ( 'maxExclusive' )
            // InternalSculpt.g:35:9: 'maxExclusive'
            {
            match("maxExclusive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:36:7: ( 'default' )
            // InternalSculpt.g:36:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:37:7: ( 'empty' )
            // InternalSculpt.g:37:9: 'empty'
            {
            match("empty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:38:7: ( '+' )
            // InternalSculpt.g:38:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:39:7: ( 'list' )
            // InternalSculpt.g:39:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:40:7: ( '<' )
            // InternalSculpt.g:40:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:41:7: ( 'minElements' )
            // InternalSculpt.g:41:9: 'minElements'
            {
            match("minElements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:42:7: ( 'maxElements' )
            // InternalSculpt.g:42:9: 'maxElements'
            {
            match("maxElements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:43:7: ( 'UNBOUNDED' )
            // InternalSculpt.g:43:9: 'UNBOUNDED'
            {
            match("UNBOUNDED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:44:7: ( 'separator' )
            // InternalSculpt.g:44:9: 'separator'
            {
            match("separator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:45:7: ( '>' )
            // InternalSculpt.g:45:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:46:7: ( 'primary' )
            // InternalSculpt.g:46:9: 'primary'
            {
            match("primary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:47:7: ( 'key' )
            // InternalSculpt.g:47:9: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:48:7: ( 'foreign' )
            // InternalSculpt.g:48:9: 'foreign'
            {
            match("foreign"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:49:7: ( 'references' )
            // InternalSculpt.g:49:9: 'references'
            {
            match("references"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:50:7: ( '{' )
            // InternalSculpt.g:50:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:51:7: ( ',' )
            // InternalSculpt.g:51:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:52:7: ( '}' )
            // InternalSculpt.g:52:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:53:7: ( 'or' )
            // InternalSculpt.g:53:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:54:7: ( 'and' )
            // InternalSculpt.g:54:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:55:7: ( 'not' )
            // InternalSculpt.g:55:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:56:7: ( '/' )
            // InternalSculpt.g:56:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:57:7: ( '(' )
            // InternalSculpt.g:57:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:58:7: ( ')' )
            // InternalSculpt.g:58:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:59:7: ( 'last' )
            // InternalSculpt.g:59:9: 'last'
            {
            match("last"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:60:7: ( 'True' )
            // InternalSculpt.g:60:9: 'True'
            {
            match("True"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:61:7: ( '.' )
            // InternalSculpt.g:61:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:62:7: ( '[' )
            // InternalSculpt.g:62:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:63:7: ( ']' )
            // InternalSculpt.g:63:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:64:7: ( '*' )
            // InternalSculpt.g:64:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:65:7: ( '?' )
            // InternalSculpt.g:65:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:66:7: ( '|' )
            // InternalSculpt.g:66:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:67:7: ( 'right' )
            // InternalSculpt.g:67:9: 'right'
            {
            match("right"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:68:7: ( 'down' )
            // InternalSculpt.g:68:9: 'down'
            {
            match("down"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:69:7: ( 'left' )
            // InternalSculpt.g:69:9: 'left'
            {
            match("left"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:70:7: ( 'up' )
            // InternalSculpt.g:70:9: 'up'
            {
            match("up"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:71:7: ( 'self' )
            // InternalSculpt.g:71:9: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:72:7: ( '::' )
            // InternalSculpt.g:72:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:73:7: ( '::*' )
            // InternalSculpt.g:73:9: '::*'
            {
            match("::*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:74:7: ( 'ANY' )
            // InternalSculpt.g:74:9: 'ANY'
            {
            match("ANY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:75:7: ( 'EMPTY' )
            // InternalSculpt.g:75:9: 'EMPTY'
            {
            match("EMPTY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:76:7: ( 'SOMETHING' )
            // InternalSculpt.g:76:9: 'SOMETHING'
            {
            match("SOMETHING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:77:7: ( './' )
            // InternalSculpt.g:77:9: './'
            {
            match("./"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:78:7: ( 'output' )
            // InternalSculpt.g:78:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:79:7: ( 'for' )
            // InternalSculpt.g:79:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:80:7: ( 'each' )
            // InternalSculpt.g:80:9: 'each'
            {
            match("each"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:81:7: ( 'in' )
            // InternalSculpt.g:81:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:82:7: ( 'if' )
            // InternalSculpt.g:82:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:83:7: ( 'else' )
            // InternalSculpt.g:83:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:84:7: ( 'is' )
            // InternalSculpt.g:84:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:85:7: ( 'row' )
            // InternalSculpt.g:85:9: 'row'
            {
            match("row"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:86:7: ( 'col' )
            // InternalSculpt.g:86:9: 'col'
            {
            match("col"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:87:7: ( '<=' )
            // InternalSculpt.g:87:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:88:7: ( '>=' )
            // InternalSculpt.g:88:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:89:7: ( '!=' )
            // InternalSculpt.g:89:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:90:7: ( '=>' )
            // InternalSculpt.g:90:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:91:7: ( '->' )
            // InternalSculpt.g:91:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:92:7: ( '|>' )
            // InternalSculpt.g:92:9: '|>'
            {
            match("|>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:93:7: ( 'split' )
            // InternalSculpt.g:93:9: 'split'
            {
            match("split"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:5118:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSculpt.g:5118:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSculpt.g:5118:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSculpt.g:5118:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSculpt.g:5118:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSculpt.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:5120:10: ( ( '0' .. '9' )+ )
            // InternalSculpt.g:5120:12: ( '0' .. '9' )+
            {
            // InternalSculpt.g:5120:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSculpt.g:5120:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:5122:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSculpt.g:5122:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSculpt.g:5122:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSculpt.g:5122:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSculpt.g:5122:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSculpt.g:5122:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSculpt.g:5122:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSculpt.g:5122:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSculpt.g:5122:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSculpt.g:5122:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSculpt.g:5122:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:5124:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSculpt.g:5124:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSculpt.g:5124:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSculpt.g:5124:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:5126:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSculpt.g:5126:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSculpt.g:5126:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSculpt.g:5126:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalSculpt.g:5126:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSculpt.g:5126:41: ( '\\r' )? '\\n'
                    {
                    // InternalSculpt.g:5126:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSculpt.g:5126:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:5128:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSculpt.g:5128:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSculpt.g:5128:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSculpt.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSculpt.g:5130:16: ( . )
            // InternalSculpt.g:5130:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSculpt.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=90;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalSculpt.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalSculpt.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalSculpt.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalSculpt.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalSculpt.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalSculpt.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalSculpt.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalSculpt.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalSculpt.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalSculpt.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalSculpt.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalSculpt.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalSculpt.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalSculpt.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalSculpt.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalSculpt.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalSculpt.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalSculpt.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalSculpt.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalSculpt.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalSculpt.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalSculpt.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalSculpt.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalSculpt.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalSculpt.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalSculpt.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalSculpt.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalSculpt.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalSculpt.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalSculpt.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalSculpt.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalSculpt.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalSculpt.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalSculpt.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalSculpt.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalSculpt.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalSculpt.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalSculpt.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalSculpt.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalSculpt.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalSculpt.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalSculpt.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalSculpt.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalSculpt.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalSculpt.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalSculpt.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalSculpt.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalSculpt.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalSculpt.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalSculpt.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalSculpt.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalSculpt.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalSculpt.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalSculpt.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalSculpt.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalSculpt.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalSculpt.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalSculpt.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalSculpt.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalSculpt.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // InternalSculpt.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // InternalSculpt.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // InternalSculpt.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // InternalSculpt.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // InternalSculpt.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // InternalSculpt.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // InternalSculpt.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // InternalSculpt.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // InternalSculpt.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // InternalSculpt.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // InternalSculpt.g:1:430: T__81
                {
                mT__81(); 

                }
                break;
            case 72 :
                // InternalSculpt.g:1:436: T__82
                {
                mT__82(); 

                }
                break;
            case 73 :
                // InternalSculpt.g:1:442: T__83
                {
                mT__83(); 

                }
                break;
            case 74 :
                // InternalSculpt.g:1:448: T__84
                {
                mT__84(); 

                }
                break;
            case 75 :
                // InternalSculpt.g:1:454: T__85
                {
                mT__85(); 

                }
                break;
            case 76 :
                // InternalSculpt.g:1:460: T__86
                {
                mT__86(); 

                }
                break;
            case 77 :
                // InternalSculpt.g:1:466: T__87
                {
                mT__87(); 

                }
                break;
            case 78 :
                // InternalSculpt.g:1:472: T__88
                {
                mT__88(); 

                }
                break;
            case 79 :
                // InternalSculpt.g:1:478: T__89
                {
                mT__89(); 

                }
                break;
            case 80 :
                // InternalSculpt.g:1:484: T__90
                {
                mT__90(); 

                }
                break;
            case 81 :
                // InternalSculpt.g:1:490: T__91
                {
                mT__91(); 

                }
                break;
            case 82 :
                // InternalSculpt.g:1:496: T__92
                {
                mT__92(); 

                }
                break;
            case 83 :
                // InternalSculpt.g:1:502: T__93
                {
                mT__93(); 

                }
                break;
            case 84 :
                // InternalSculpt.g:1:508: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 85 :
                // InternalSculpt.g:1:516: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 86 :
                // InternalSculpt.g:1:525: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 87 :
                // InternalSculpt.g:1:537: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 88 :
                // InternalSculpt.g:1:553: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 89 :
                // InternalSculpt.g:1:569: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 90 :
                // InternalSculpt.g:1:577: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\3\67\1\100\1\uffff\2\67\1\105\7\67\1\uffff\1\125\2\67\1\132\3\67\3\uffff\3\67\1\151\2\uffff\1\155\4\uffff\1\163\6\67\3\65\2\uffff\2\65\2\uffff\1\67\1\uffff\7\67\3\uffff\2\67\1\u008c\1\uffff\15\67\3\uffff\3\67\2\uffff\5\67\3\uffff\1\u00a5\3\67\15\uffff\1\u00a9\3\67\1\u00ad\1\u00ae\1\u00af\1\67\5\uffff\12\67\2\uffff\1\67\1\u00be\22\67\1\u00d7\2\67\1\u00da\1\uffff\1\67\1\u00dc\1\u00dd\1\uffff\1\u00de\2\67\3\uffff\1\u00e1\4\67\1\u00e6\2\67\2\uffff\1\67\1\u00ea\2\67\1\uffff\2\67\1\u00ef\2\67\1\u00f2\1\u00f3\1\u00f4\11\67\1\u0100\1\u0101\2\67\1\u0104\2\67\1\uffff\2\67\1\uffff\1\67\3\uffff\2\67\1\uffff\1\67\1\u010d\2\67\1\uffff\1\67\1\u0111\2\uffff\4\67\1\uffff\2\67\3\uffff\12\67\1\u0122\2\uffff\2\67\1\uffff\1\u0125\2\67\1\u0128\1\67\1\u012a\2\67\1\uffff\1\u012d\2\67\1\uffff\1\u0130\4\67\1\u0135\12\67\1\uffff\2\67\1\uffff\2\67\1\uffff\1\u0144\1\uffff\2\67\1\uffff\1\67\1\u0148\1\uffff\1\u0149\1\67\1\u014b\1\67\1\uffff\1\67\1\u014e\4\67\1\u0153\5\67\1\u0159\1\67\1\uffff\3\67\2\uffff\1\67\1\uffff\2\67\1\uffff\4\67\1\uffff\5\67\1\uffff\5\67\1\u016f\1\u0170\3\67\1\u0174\3\67\1\u0178\1\u0179\1\67\1\u017b\1\u017c\2\67\2\uffff\3\67\1\uffff\3\67\2\uffff\1\u0185\2\uffff\1\67\1\u0187\2\67\1\u018a\2\67\1\u018d\1\uffff\1\67\1\uffff\1\u018f\1\u0190\1\uffff\1\u0191\1\u0192\1\uffff\1\67\4\uffff\1\67\1\uffff";
    static final String DFA12_eofS =
        "\u0195\uffff";
    static final String DFA12_minS =
        "\1\0\1\105\1\117\1\105\1\76\1\uffff\1\157\1\151\1\72\1\141\1\157\1\145\1\162\3\141\1\uffff\1\75\1\116\1\145\1\75\1\162\2\145\3\uffff\1\162\1\156\1\157\1\52\2\uffff\1\57\4\uffff\1\76\1\160\1\116\1\115\1\117\1\146\1\157\1\75\1\76\1\101\2\uffff\2\0\2\uffff\1\114\1\uffff\1\120\1\113\1\101\1\165\1\107\1\114\1\167\3\uffff\1\154\1\163\1\52\1\uffff\1\163\1\162\1\143\1\167\1\157\1\146\2\163\1\156\1\170\1\160\1\143\1\163\3\uffff\1\102\2\154\2\uffff\1\151\1\171\1\146\1\147\1\167\3\uffff\1\60\1\164\1\144\1\164\15\uffff\1\60\1\131\1\120\1\115\3\60\1\154\5\uffff\1\111\2\105\1\116\1\145\1\111\1\105\2\40\1\164\2\uffff\1\145\1\60\1\151\1\141\1\156\1\165\1\147\3\164\2\105\1\164\1\150\1\145\1\117\1\141\1\146\1\151\1\155\1\60\1\145\1\150\1\60\1\uffff\1\160\2\60\1\uffff\1\60\1\124\1\105\3\uffff\1\60\1\115\1\123\1\116\1\123\1\60\1\117\1\123\2\uffff\1\40\1\60\1\141\1\151\1\uffff\1\155\1\165\1\60\1\160\1\164\3\60\1\145\1\155\1\156\1\154\1\145\1\155\1\156\1\154\1\171\2\60\1\125\1\162\1\60\1\164\1\141\1\uffff\1\162\1\164\1\uffff\1\165\3\uffff\1\131\1\124\1\uffff\1\111\1\60\1\123\1\106\1\uffff\1\116\1\60\2\uffff\1\164\1\147\1\141\1\154\1\uffff\1\103\1\150\3\uffff\1\156\1\165\2\143\1\145\1\156\1\165\2\143\1\145\1\60\2\uffff\1\116\1\141\1\uffff\1\60\1\162\1\145\1\60\1\164\1\60\1\110\1\124\1\uffff\1\60\1\117\1\123\1\uffff\1\60\1\156\1\154\1\164\1\150\1\60\1\147\1\155\2\154\1\155\1\147\1\155\2\154\1\155\1\uffff\1\104\1\164\1\uffff\1\171\1\156\1\uffff\1\60\1\uffff\1\111\1\105\1\uffff\1\122\1\60\1\uffff\1\60\1\103\1\60\1\141\1\uffff\1\164\1\60\2\165\1\145\1\164\1\60\2\165\1\145\1\105\1\157\1\60\1\143\1\uffff\1\116\1\122\1\115\2\uffff\1\150\1\uffff\1\162\1\150\1\uffff\2\163\1\156\1\150\1\uffff\2\163\1\156\1\104\1\162\1\uffff\1\145\1\107\1\123\1\101\1\141\2\60\2\151\1\164\1\60\2\151\1\164\2\60\1\163\2\60\1\124\1\162\2\uffff\2\166\1\163\1\uffff\2\166\1\163\2\uffff\1\60\2\uffff\1\111\1\60\2\145\1\60\2\145\1\60\1\uffff\1\117\1\uffff\2\60\1\uffff\2\60\1\uffff\1\116\4\uffff\1\40\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\105\1\162\1\157\1\76\1\uffff\1\157\1\151\1\72\1\141\2\157\1\162\2\151\1\155\1\uffff\1\75\1\116\1\160\1\75\1\162\1\145\1\157\3\uffff\1\165\1\156\1\157\1\57\2\uffff\1\57\4\uffff\1\76\1\160\1\116\1\115\1\117\1\163\1\157\1\75\1\76\1\172\2\uffff\2\uffff\2\uffff\1\114\1\uffff\1\120\1\113\1\101\1\165\1\107\1\114\1\167\3\uffff\1\154\1\163\1\52\1\uffff\1\163\1\162\1\146\1\167\1\157\1\156\2\163\1\156\1\170\1\160\1\143\1\163\3\uffff\1\102\1\160\1\154\2\uffff\1\151\1\171\1\146\1\147\1\167\3\uffff\1\172\1\164\1\144\1\164\15\uffff\1\172\1\131\1\120\1\115\3\172\1\154\5\uffff\1\111\2\105\1\116\1\145\1\111\1\105\2\40\1\164\2\uffff\1\145\1\172\1\151\1\141\1\156\1\165\1\147\3\164\2\151\1\164\1\150\1\145\1\117\1\141\1\146\1\151\1\155\1\172\1\145\1\150\1\172\1\uffff\1\160\2\172\1\uffff\1\172\1\124\1\105\3\uffff\1\172\1\115\1\123\1\116\1\123\1\172\1\117\1\123\2\uffff\1\40\1\172\1\141\1\151\1\uffff\1\155\1\165\1\172\1\160\1\164\3\172\1\145\1\155\1\156\1\170\1\145\1\155\1\156\1\170\1\171\2\172\1\125\1\162\1\172\1\164\1\141\1\uffff\1\162\1\164\1\uffff\1\165\3\uffff\1\131\1\124\1\uffff\1\111\1\172\1\123\1\106\1\uffff\1\116\1\172\2\uffff\1\164\1\147\1\141\1\154\1\uffff\1\103\1\150\3\uffff\1\156\1\165\2\143\1\145\1\156\1\165\2\143\1\145\1\172\2\uffff\1\116\1\141\1\uffff\1\172\1\162\1\145\1\172\1\164\1\172\1\110\1\124\1\uffff\1\172\1\117\1\123\1\uffff\1\172\1\156\1\154\1\164\1\150\1\172\1\147\1\155\2\154\1\155\1\147\1\155\2\154\1\155\1\uffff\1\104\1\164\1\uffff\1\171\1\156\1\uffff\1\172\1\uffff\1\111\1\105\1\uffff\1\122\1\172\1\uffff\1\172\1\103\1\172\1\141\1\uffff\1\164\1\172\2\165\1\145\1\164\1\172\2\165\1\145\1\105\1\157\1\172\1\143\1\uffff\1\116\1\122\1\115\2\uffff\1\150\1\uffff\1\162\1\150\1\uffff\2\163\1\156\1\150\1\uffff\2\163\1\156\1\104\1\162\1\uffff\1\145\1\107\1\123\1\101\1\141\2\172\2\151\1\164\1\172\2\151\1\164\2\172\1\163\2\172\1\124\1\162\2\uffff\2\166\1\163\1\uffff\2\166\1\163\2\uffff\1\172\2\uffff\1\111\1\172\2\145\1\172\2\145\1\172\1\uffff\1\117\1\uffff\2\172\1\uffff\2\172\1\uffff\1\116\4\uffff\1\40\1\uffff";
    static final String DFA12_acceptS =
        "\5\uffff\1\11\12\uffff\1\34\7\uffff\1\50\1\51\1\52\4\uffff\1\57\1\60\1\uffff\1\64\1\65\1\66\1\67\12\uffff\1\124\1\125\2\uffff\1\131\1\132\1\uffff\1\124\7\uffff\1\120\1\10\1\11\3\uffff\1\14\15\uffff\1\34\1\115\1\36\3\uffff\1\116\1\43\5\uffff\1\50\1\51\1\52\4\uffff\1\127\1\130\1\56\1\57\1\60\1\103\1\63\1\64\1\65\1\66\1\67\1\122\1\70\10\uffff\1\117\1\121\1\125\1\126\1\131\12\uffff\1\77\1\76\30\uffff\1\53\3\uffff\1\74\3\uffff\1\107\1\110\1\112\10\uffff\1\7\1\12\4\uffff\1\105\30\uffff\1\45\2\uffff\1\113\1\uffff\1\54\1\55\1\100\2\uffff\1\114\4\uffff\1\62\2\uffff\1\13\1\15\4\uffff\1\72\2\uffff\1\73\1\35\1\61\13\uffff\1\106\1\111\2\uffff\1\75\10\uffff\1\2\3\uffff\1\5\20\uffff\1\33\2\uffff\1\123\2\uffff\1\71\1\uffff\1\101\2\uffff\1\3\2\uffff\1\16\4\uffff\1\21\16\uffff\1\104\3\uffff\1\4\1\46\1\uffff\1\32\2\uffff\1\24\4\uffff\1\26\5\uffff\1\44\25\uffff\1\20\1\22\3\uffff\1\23\3\uffff\1\41\1\42\1\uffff\1\102\1\1\10\uffff\1\47\1\uffff\1\17\2\uffff\1\37\2\uffff\1\40\1\uffff\1\25\1\30\1\27\1\31\1\uffff\1\6";
    static final String DFA12_specialS =
        "\1\1\61\uffff\1\0\1\2\u0161\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\65\2\64\2\65\1\64\22\65\1\64\1\55\1\62\4\65\1\63\1\37\1\40\1\44\1\20\1\31\1\56\1\41\1\36\12\61\1\10\1\5\1\21\1\4\1\24\1\45\1\65\1\50\1\60\1\6\1\1\1\51\6\60\1\7\5\60\1\3\1\52\1\2\1\22\5\60\1\42\1\65\1\43\1\57\1\60\1\65\1\34\1\11\1\54\1\13\1\17\1\12\1\14\1\60\1\53\1\60\1\26\1\15\1\16\1\35\1\33\1\25\1\60\1\27\1\23\1\60\1\47\5\60\1\30\1\46\1\32\uff82\65",
            "\1\66",
            "\1\71\2\uffff\1\72\6\uffff\1\70\30\uffff\1\73",
            "\1\74\17\uffff\1\75\31\uffff\1\76",
            "\1\77",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\106",
            "\1\107",
            "\1\110\11\uffff\1\111",
            "\1\112",
            "\1\115\3\uffff\1\113\3\uffff\1\114",
            "\1\117\7\uffff\1\116",
            "\1\121\12\uffff\1\122\1\120",
            "",
            "\1\124",
            "\1\126",
            "\1\127\12\uffff\1\130",
            "\1\131",
            "\1\133",
            "\1\134",
            "\1\135\3\uffff\1\136\5\uffff\1\137",
            "",
            "",
            "",
            "\1\143\2\uffff\1\144",
            "\1\145",
            "\1\146",
            "\1\147\4\uffff\1\150",
            "",
            "",
            "\1\154",
            "",
            "",
            "",
            "",
            "\1\162",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\171\7\uffff\1\170\4\uffff\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\0\177",
            "\0\177",
            "",
            "",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f\2\uffff\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0094\7\uffff\1\u0093",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "",
            "\1\u009c",
            "\1\u009e\3\uffff\1\u009d",
            "\1\u009f",
            "",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00b0",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "",
            "\1\u00bb",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\u00bd\7\67\1\u00bc\15\67",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00ca\3\uffff\1\u00c9\2\uffff\1\u00c7\34\uffff\1\u00c8",
            "\1\u00ce\3\uffff\1\u00cd\2\uffff\1\u00cb\34\uffff\1\u00cc",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00d8",
            "\1\u00d9",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u00db",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00df",
            "\1\u00e0",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "",
            "\1\u00e9",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00f0",
            "\1\u00f1",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f9\13\uffff\1\u00f8",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fe\13\uffff\1\u00fd",
            "\1\u00ff",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0102",
            "\1\u0103",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0105",
            "\1\u0106",
            "",
            "\1\u0107",
            "\1\u0108",
            "",
            "\1\u0109",
            "",
            "",
            "",
            "\1\u010a",
            "\1\u010b",
            "",
            "\1\u010c",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u010e",
            "\1\u010f",
            "",
            "\1\u0110",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "",
            "",
            "",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\1\u0123",
            "\1\u0124",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0126",
            "\1\u0127",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0129",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u012b",
            "\1\u012c",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u012e",
            "\1\u012f",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "",
            "\1\u0140",
            "\1\u0141",
            "",
            "\1\u0142",
            "\1\u0143",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0145",
            "\1\u0146",
            "",
            "\1\u0147",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u014a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u014c",
            "",
            "\1\u014d",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u015a",
            "",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "",
            "",
            "\1\u015e",
            "",
            "\1\u015f",
            "\1\u0160",
            "",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u017a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u017d",
            "\1\u017e",
            "",
            "",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\1\u0186",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0188",
            "\1\u0189",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u018b",
            "\1\u018c",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u018e",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0193",
            "",
            "",
            "",
            "",
            "\1\u0194",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    static class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_50 = input.LA(1);

                        s = -1;
                        if ( ((LA12_50>='\u0000' && LA12_50<='\uFFFF')) ) {s = 127;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='D') ) {s = 1;}

                        else if ( (LA12_0=='T') ) {s = 2;}

                        else if ( (LA12_0=='R') ) {s = 3;}

                        else if ( (LA12_0=='=') ) {s = 4;}

                        else if ( (LA12_0==';') ) {s = 5;}

                        else if ( (LA12_0=='C') ) {s = 6;}

                        else if ( (LA12_0=='L') ) {s = 7;}

                        else if ( (LA12_0==':') ) {s = 8;}

                        else if ( (LA12_0=='b') ) {s = 9;}

                        else if ( (LA12_0=='f') ) {s = 10;}

                        else if ( (LA12_0=='d') ) {s = 11;}

                        else if ( (LA12_0=='g') ) {s = 12;}

                        else if ( (LA12_0=='l') ) {s = 13;}

                        else if ( (LA12_0=='m') ) {s = 14;}

                        else if ( (LA12_0=='e') ) {s = 15;}

                        else if ( (LA12_0=='+') ) {s = 16;}

                        else if ( (LA12_0=='<') ) {s = 17;}

                        else if ( (LA12_0=='U') ) {s = 18;}

                        else if ( (LA12_0=='s') ) {s = 19;}

                        else if ( (LA12_0=='>') ) {s = 20;}

                        else if ( (LA12_0=='p') ) {s = 21;}

                        else if ( (LA12_0=='k') ) {s = 22;}

                        else if ( (LA12_0=='r') ) {s = 23;}

                        else if ( (LA12_0=='{') ) {s = 24;}

                        else if ( (LA12_0==',') ) {s = 25;}

                        else if ( (LA12_0=='}') ) {s = 26;}

                        else if ( (LA12_0=='o') ) {s = 27;}

                        else if ( (LA12_0=='a') ) {s = 28;}

                        else if ( (LA12_0=='n') ) {s = 29;}

                        else if ( (LA12_0=='/') ) {s = 30;}

                        else if ( (LA12_0=='(') ) {s = 31;}

                        else if ( (LA12_0==')') ) {s = 32;}

                        else if ( (LA12_0=='.') ) {s = 33;}

                        else if ( (LA12_0=='[') ) {s = 34;}

                        else if ( (LA12_0==']') ) {s = 35;}

                        else if ( (LA12_0=='*') ) {s = 36;}

                        else if ( (LA12_0=='?') ) {s = 37;}

                        else if ( (LA12_0=='|') ) {s = 38;}

                        else if ( (LA12_0=='u') ) {s = 39;}

                        else if ( (LA12_0=='A') ) {s = 40;}

                        else if ( (LA12_0=='E') ) {s = 41;}

                        else if ( (LA12_0=='S') ) {s = 42;}

                        else if ( (LA12_0=='i') ) {s = 43;}

                        else if ( (LA12_0=='c') ) {s = 44;}

                        else if ( (LA12_0=='!') ) {s = 45;}

                        else if ( (LA12_0=='-') ) {s = 46;}

                        else if ( (LA12_0=='^') ) {s = 47;}

                        else if ( (LA12_0=='B'||(LA12_0>='F' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='Q')||(LA12_0>='V' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='h'||LA12_0=='j'||LA12_0=='q'||LA12_0=='t'||(LA12_0>='v' && LA12_0<='z')) ) {s = 48;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 49;}

                        else if ( (LA12_0=='\"') ) {s = 50;}

                        else if ( (LA12_0=='\'') ) {s = 51;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 52;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='&')||LA12_0=='@'||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 53;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_51 = input.LA(1);

                        s = -1;
                        if ( ((LA12_51>='\u0000' && LA12_51<='\uFFFF')) ) {s = 127;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}