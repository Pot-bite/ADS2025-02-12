package by.it.group451002.chuyashov.lesson01;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertTrue;

@SuppressWarnings("all")
public class Lesson01Test {
    /*
    для прохождения тестов создайте JUnit-конфигурацию на свой пакет:
    Поля:
    Name:               Test a_khmelev (тут ваша фамилия)
    Test kind:          All in package
    Package:            by.it.группа.a_khmelev (тут ваша фамилия)
    Search for test:    In whole project
    */

    @Test(timeout = 2000)
    public void checkA_slow() throws Exception {
        FiboA fibo = new FiboA();
        BigInteger res = fibo.slowA(33);
        boolean ok = res.toString().equals("3524578");
        assertTrue("slowA failed", ok);
    }

    @Test(timeout = 2000)
    public void checkB_fast() throws Exception {
        FiboB fibo = new FiboB();
        BigInteger res = fibo.fastB(55555);
        boolean ok = res.toString().equals("909639027887347144342941161985282559355604430178183350584743748717027366542263454115774180457764119361178818065700599781605301031045912765958497937280143381078273858129564496371971635030388750211987018878594019122081608369859944055268290173661554656988657518473325524758272795937728604044464542075109647906732003650134988406067095491300374765088995480882968323512392912312617101227083974431097843457164074034436313773650841482061774891287543184545319371770727639363930224382008732215830209082100766659544448480462507899357524202479150382770774225865911940587951107025348123733528069313663520384501512487053755021582416432850008389098306703752469001379572433690896114640467636745086253877163269201080071042494668988577461564455432769254924713162146595798906578795216402666025860799868329860419563359713651103025221898184983333267778823082367482711242103128392639556863537102898301584759995002143070624597894698442040541110354780977822565822171878905836685636670318316609386609202981350416675502168926283222103319258798073524908331967335663739592708768575160693887587735383269058895502334974804209475257196644182183401092327147491379059823962903951993250290841961188457640918400772385828052455203308446497850522876608528180685531168473225828714565131444729283223699444503340482790428257563981286491892991033660246616024417941332506656689310748059549811484339433261117033259300500652902600115830724750452473301964550639144809470925781705205968970158308389657887649940883753804405196006995646957204750059695355436194123493457393941168645210746811798866778101896550299432514806643837980851710824081612727110722903372833776910411007619235864817126801702604065158334293916156858599848629086275942621396162424197955746781438271034399002200063411918796452136003564078905058991463355510592166377559715763614721727528762174985396734474738268089578234506515167275375031138709799221183193411830728781110315375410911538679192274012094572237862077799468940063396469472599562545280819613024692324290422417839590915081207851260450836509701986374443916520141544165383083153839035877261659612382394632908007237421298532631111604945472400580867112299736836453942883040919301426094366040263165816911324753683371254510146219312091798708493014082923046997229461410584400431963646196252695714577178308225591412910064716932858200159965282243561088622912391823483428553478212367172161995145427807648571543023538682011236247367500274357118969986946537681049847626833132626372331564775657970641545523598392909167955481457119817830082623455816062894209540469687455385575569476674039940711008474204307994961300581065435298861539733935163376567922721517142143870693595730772685170607264169021390358395399881188502427638248182477340230104522058037488718549609599732273262380107970103277852454079585014822446529907617554793888590318212831222877218400569978891912384375052727128718524934694661093439843049535858173127778867554834009090803582310094817387989046072275124327174453547387528618636253514292557730838237832283956847317251403978580909937787351429711078779176486954188835695627800987961493008146727150524700479682194654092491230343705472375989711563194519597413676122218700696331903370014042611855683236265661719277254818697403919130430082970613330085512630581993711275159086521623909671751050921361703343681699299208222210483191228642778043551720776161308201536353678451006349284573330815487139659744321673584559584535627067439581010081475569270508585650460599634412977833754040474620298291660929317207989213615847996337996513194412889319901026696279249614618048263112515523015028139115642407637494547067374364469154787640932535093313030524973284071847837684736975960823366826524971915596117141751173539262729086663116346365870365304961139616265531459119026052533301468820910319585978974579222551497319612280250272156600439579462572938175236818419213102577039797603964012311447121482962605776496764124907797045802761239464920829449200700588088226581890821754119528698448992492281777980743978405757962977498730099652422271747491916518058732412727393295412382217561015709276476265222622439458716140712781458897230945546868329928230421054584160200580399770646730181726541248601424838093255137542059863632032681191155464626810329003052450414902087133451713656344971266301306286598384154530437443195904584793667201486293909822730384866567403589855617148472976331377475537071340992696406582003033494858455633469855189854940169584255295881044283926177924571700029807536243414753698785712283199281467324771044558885623524634519934706960773040035641679891564766888028735640301056231364309188747975235305086820099619101194834477655410300908530799568056341467135959865163012148879799637372073120238334002164083141825552383359986157349055506671454613969971250993197318896380371736044700678686839058532742550672100148762502462567690393928229862990414662283465195719969681192925317147860433332662900777435695885742702980153579468077090503778385793045257952950939571400815755338835778252681311651211593423223271033820090662697446363417460923662250393808376533067948734141461696784826857742355326481531786608713950657208084344938550518227245946447950939511777299612416771729542414142576982603181588548594463903119620377875737240585329354450191149476257004704220396218896372972566563146603173395844213465455964339975758771738916022135628159697749562375309032256886577396168475827194326636777935421248710464612589191850097913011941826600916151746153573160932425356307913018103818572231771494548545466579668290240407141870360876562951856602444500777026852071846553257362419622464288697450580933026516503035014339009765843791821196411312165393747945504793993299751422908151987854767765817269975642144761884958625379183412350880981868626565168326052339532680197197858200204765140560748809378804767059034896306912874114267381150013577312431115293222274051955700161995353499107308739432654491665121139862651022220977402790694292313265157926210586554304669753789549742695475816403068323026643883659608102895106663954928507274638709413715276973722234800924968628551339593194656950666233178329230171300171790896760977977600703054490908033779919061417430767972754011226620011447787770040516989025818170004928836489506904080580895410790729678817790554829402807415722829064048804325214048768867868973205447913321185017203366768134124893876478106169409068166845256345603614755952200995450506503253096322589741111272573860520318560975126951189832398691354790155624215487306220430798632050226044082813297278674533852360615715272471146505997831814294373508289575689863926936157018562847403666957893046474794231832245767915764950463063819418934599036046132748550708580576092027307732454889200961677384186109536709266079853985476523531346415464941229194954505563092687327971602994597871986901655705546866430975791120173653270445491788176467125447014593030142811426624156667284237606937924697282519593068350824281461162360460317917445333603270404304171598255866616988625308545480547154998052222643657711174682277414701792789234550398444243563783350442559055541908269576447978400898556078854184975313420863644992336418260123115661138641838759121980922980182746613943486465087534850232586744133841747636710046314846745831670994098779580524422809535845883196541125925818027934524935795767942477297350167199511158722375729298143275562777989210939237729459500581200151961622610294719193912857664983695747089418077848341842747479353605964240934175117419680043821686563473525770356986897633945931996114027441293993666079903771862622785438928626113923911063936627869681173024996982573602392657779169262900509896269475824282258512914113759956518014684249546781380028633024426568315690423091176078448062494938618353795856287157761500396653963545510376826468285937461198717614785486284331624856379761950342941444039902439629145470393835639847926115014167679471960937462655579715056840092791540700933617938096273282334596764346928341223024309869218051536398537753802101110929837955769236103813869055495099703262883409012041761848724021333195454659951646980359421677064210706863660168861016236559537365045396235129819997695240203563639949785452598555874284145741040777257331880614743732438162252284147764148035005741554344546279394472438931324820288026274519808242693869080414444386675028918373153401490768380843351848427113619478744126210371863122440093613655447577113249000267942356307385248399435895311440865406541769774462963106844269995751111165312365889148985270030844877174359429336511675454861607078483687194200066090642719223093576427110150588110262193847157421102306411197089273574347086542400800528633585357786827095878525421498709518886724470954005978197906964718477002198987643283664577833752291238017460379354661683518044119258658196403688119863911001969457493498416088591539522805271419678746763581838734245715754721462086955985058439722368277588862050210922965588458008390805204826682386085423655836350934031315253436248696684634375070218291996645101785894679972053232999268463391792491397202598698532549209306038407089389170814042190047516687465343718894057618663112796109731136276137806006584813314845139426531979308355804915578565990413773376631453799855137038090741773508055133822860525243513283527061589059172286453679441998352714513650394795295105354986943863982582202530167265532500296148726539153598148766840870641239364617379750315388889503569004926351420656298789603645728951021324352143042614674039251422115798697547713631123807698993164925645374669805460077809276103954476896034509625394385947204050185217855524099622360537052794654126314130181596293144127267509390351018246614606419621608169991253167324318111584118384187873077324332235101472978837059697059900874239444989224012834638657187726461799190254373145224070507453490923444230916867959017257447376941662132028194306992196255147173779906789871155483492726999503177894814033511619479083908698457989598370495012644118329516819853330226633565412918634998283088126395380398793476716953835254592257031565790616613525000495203746662094756817245475391242659231997308097443779983219354573130426611778478692593591583617546914799296804525789713206912214531267052339211190112282721627175290941677106804596492543428294900573560468271465025689687105084668468189619639767716888486300937738962512530217833483251969414978948838418010674059964119031192844349921473189890333562644298871733567268178369507713139770414787297439886671772253317004726358040061068277570898528015355478563278532031290793232443681316564577939942167329056757668531416126638187915973262788310855346242953743907089052889700419942324397362425606941409727506690635964020154837089838696081484461121904400568295520716383595963400635719347742258457380004078279995058218236192428143853631277927475108860128155160872714269943851277340373266639438556500597050794352027301766865935883146777193359759064506577499692945142961399847185363846035489411916728005190125133620051680304062592494005371056113711295667563242745476125963220775394209187567930808056120453037041093082967574251679712066113534102230967327013521657561065451643719451653530724205229681371200152912780481428209508316270189500076121582841081399695808147375164707080761193903187755870846758109462933355019372529492513155055378096677369110652175673711075578590299120574710961154283757840850882013305753689311953733654090859881700093223315641073455810767834119285376879100652544381617590818383118661851414962612809756947753199125171502545556831799322789170241148215338109963325425668997935546328658765991089842850466571454347611327119513293519489362335958179174105025034828099588669105077499597365168880387075676110356654357331280261235167283832661443727354497944795910894953884419939619445");
        assertTrue("fastB failed", ok);
    }


    @Test(timeout = 2000)
    public void checkC_faster() throws Exception {
        FiboC fibo = new FiboC();
        assertTrue("fasterC failed 1", fibo.fasterC(10, 2) == 1L);
        assertTrue("fasterC failed 2", fibo.fasterC(1, 2) == 1L);
        assertTrue("fasterC failed 3", fibo.fasterC(999999999, 321) == 34L);
    }
}
