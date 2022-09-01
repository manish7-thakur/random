import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class BinaryTreeManiaTest {
    @Test
    public void Invert2Nodes() {
        TreeNode root = new TreeNode(5, null, new TreeNode(6, null, null));
        BinaryTreeMania.invert(root);
        Assert.assertNull(root.right);
        Assert.assertEquals(6, root.left.val);

        root = new TreeNode(5, new TreeNode(4, new TreeNode(3, null, null), null), new TreeNode(6, null, new TreeNode(7, null, null)));
        BinaryTreeMania.invert(root);
        Assert.assertEquals(4, root.right.val);
        Assert.assertEquals(6, root.left.val);
        Assert.assertEquals(7, root.left.left.val);
        Assert.assertNull(root.left.right);
        Assert.assertEquals(3, root.right.right.val);
        Assert.assertNull(root.right.left);

        root = new TreeNode(5, new TreeNode(4, new TreeNode(3, null, null), new TreeNode(2, null, null)),
                new TreeNode(6, new TreeNode(8, null, null), new TreeNode(7, null, null)));
        BinaryTreeMania.invert(root);
        Assert.assertEquals(4, root.right.val);
        Assert.assertEquals(6, root.left.val);
        Assert.assertEquals(7, root.left.left.val);
        Assert.assertEquals(8, root.left.right.val);
        Assert.assertEquals(3, root.right.right.val);
        Assert.assertEquals(2, root.right.left.val);
    }

    @Test
    public void findRightSideView() {
      List<Integer> actual = BinaryTreeMania.rightSideView(null);
      Assert.assertTrue(actual.isEmpty());

      TreeNode root = new TreeNode(1, null, null);
      actual = BinaryTreeMania.rightSideView(root);
      List<Integer> expected = Arrays.asList(1);
      Assert.assertEquals(expected, actual);

      root = new TreeNode(1, null, new TreeNode(2));
      actual = BinaryTreeMania.rightSideView(root);
      expected = Arrays.asList(1, 2);
      Assert.assertEquals(expected, actual);

      root = new TreeNode(1, new TreeNode(3), new TreeNode(2));
      actual = BinaryTreeMania.rightSideView(root);
      expected = Arrays.asList(1, 2);
      Assert.assertEquals(expected, actual);

      root = new TreeNode(1, new TreeNode(3, null, new TreeNode(4, new TreeNode(5),null)), null);
      actual = BinaryTreeMania.rightSideView(root);
      expected = Arrays.asList(1, 3, 4, 5);
      Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSerializeBinaryTree() {
      String actual = BinaryTreeMania.serialize(null);
      String expected = "n";
      Assert.assertEquals(expected, actual);

      TreeNode root = new TreeNode(2);
      actual = BinaryTreeMania.serialize(root);
      expected = "2,n,n";
      Assert.assertEquals(expected, actual);

      root = new TreeNode(2, null, new TreeNode(3));
      actual = BinaryTreeMania.serialize(root);
      expected = "2,n,3,n,n";
      Assert.assertEquals(expected, actual);

      root = new TreeNode(2, new TreeNode(4), new TreeNode(3));
      actual = BinaryTreeMania.serialize(root);
      expected = "2,4,3,n,n,n,n";
      Assert.assertEquals(expected, actual);

      root = new TreeNode(2, new TreeNode(-4, new TreeNode(1), null), new TreeNode(3, null, new TreeNode(-1)));
      actual = BinaryTreeMania.serialize(root);
      expected = "2,-4,3,1,n,n,-1,n,n,n,n";
      Assert.assertEquals(expected, actual);

      root = new TreeNode(1, new TreeNode(2, null, new TreeNode(3, new TreeNode(4, null, new TreeNode(5)), null)), null);
      actual = BinaryTreeMania.serialize(root);
      expected = "1,2,n,n,3,4,n,n,5,n,n";
      Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDeserializeBinaryTree() {
      TreeNode root = BinaryTreeMania.deserialize("");
      Assert.assertNull(root);

      root = BinaryTreeMania.deserialize("n");
      Assert.assertNull(root);

      root = BinaryTreeMania.deserialize("13");
      Assert.assertEquals(13, root.val);

      root = BinaryTreeMania.deserialize("13,253,34");
      Assert.assertEquals(13, root.val);
      Assert.assertEquals(253, root.left.val);
      Assert.assertEquals(34, root.right.val);

      root = BinaryTreeMania.deserialize("-13,n,34");
      Assert.assertEquals(-13, root.val);
      Assert.assertNull(root.left);
      Assert.assertEquals(34, root.right.val);

      root = BinaryTreeMania.deserialize("-13,n,34,23");
      Assert.assertEquals(-13, root.val);
      Assert.assertNull(root.left);
      Assert.assertEquals(34, root.right.val);
      Assert.assertEquals(23, root.right.left.val);

      root = BinaryTreeMania.deserialize("-13,n,34,23,n,-364,456");
      Assert.assertEquals(-13, root.val);
      Assert.assertNull(root.left);
      Assert.assertEquals(34, root.right.val);
      Assert.assertEquals(23, root.right.left.val);
      Assert.assertNull(root.right.right);
      Assert.assertEquals(-364, root.right.left.left.val);
      Assert.assertEquals(456, root.right.left.right.val);

      root = BinaryTreeMania.deserialize("1,n,2,n,3,n,4,n,5");
      Assert.assertEquals(1, root.val);
      Assert.assertEquals(2, root.right.val);
      Assert.assertEquals(3, root.right.right.val);
      Assert.assertEquals(4, root.right.right.right.val);
      Assert.assertEquals(5, root.right.right.right.right.val);

      root = BinaryTreeMania.deserialize("1,2,3,n,n,4,5");
      Assert.assertEquals(1, root.val);
      Assert.assertEquals(2, root.left.val);
      Assert.assertEquals(3, root.right.val);
      Assert.assertEquals(4, root.right.left.val);
      Assert.assertEquals(5, root.right.right.val);

      root = BinaryTreeMania.deserialize("1,2,n,n,3,4,n,n,5,n,n");
      Assert.assertEquals(1, root.val);
      Assert.assertEquals(2, root.left.val);
      Assert.assertEquals(3, root.left.right.val);
      Assert.assertEquals(4, root.left.right.left.val);
      Assert.assertEquals(5, root.left.right.left.right.val);
    }

    @Test
    public void testValidatePreorderSerialization() {
      String treeStr = "#";
      Assert.assertTrue(BinaryTreeMania.isValidSerialization(treeStr));

      treeStr = "#,#";
      Assert.assertFalse(BinaryTreeMania.isValidSerialization(treeStr));

      treeStr = "#,#,#";
      Assert.assertFalse(BinaryTreeMania.isValidSerialization(treeStr));

      treeStr = "9,#,#";
      Assert.assertTrue(BinaryTreeMania.isValidSerialization(treeStr));

      treeStr = "9,#,#,#,#";
      Assert.assertFalse(BinaryTreeMania.isValidSerialization(treeStr));

      treeStr = "9,#";
      Assert.assertFalse(BinaryTreeMania.isValidSerialization(treeStr));

      treeStr = "9,#,#,1";
      Assert.assertFalse(BinaryTreeMania.isValidSerialization(treeStr));

      treeStr = "9,#,1,#,#";
      Assert.assertTrue(BinaryTreeMania.isValidSerialization(treeStr));

      treeStr = "9,1,#,#,#";
      Assert.assertTrue(BinaryTreeMania.isValidSerialization(treeStr));

      treeStr = "9,-5,6,1,#,#,#,#,#";
      Assert.assertTrue(BinaryTreeMania.isValidSerialization(treeStr));

      treeStr = "-9,#,-5,6,#,7,#,#,#";
      Assert.assertTrue(BinaryTreeMania.isValidSerialization(treeStr));

      treeStr = "-9,#,-5,#,-6,#,7,#,#";
      Assert.assertTrue(BinaryTreeMania.isValidSerialization(treeStr));

      treeStr = "-9,#,-5,#,#,7,#,#,#";
      Assert.assertFalse(BinaryTreeMania.isValidSerialization(treeStr));

      treeStr = "9,3,4,#,#,1,#,#,2,#,6,#,#";
      Assert.assertTrue(BinaryTreeMania.isValidSerialization(treeStr));
    }

    @Test
    public void findMinimumHeightTrees() {
      List<Integer> actual = BinaryTreeMania.minHeightTrees(1, new int[][]{});
      List<Integer> expected = List.of(0);
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.minHeightTrees(2, new int[][]{{0, 1}});
      expected = List.of(0, 1);
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.minHeightTrees(3, new int[][]{{0, 1}, {1, 2}});
      expected = List.of(1);
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.minHeightTrees(6, new int[][]{{0, 3}, {1, 3}, {3, 2}, {4, 3}, {5, 4}});
      expected = List.of(3, 4);
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.minHeightTrees(1212, new int[][]{{0,1},{0,2},{1,3},{1,4},{4,5},{4,6},{6,7},{5,8},{7,9},{1,10},{1,11},{2,12},{9,13},{13,14},{0,15},{10,16},{7,17},{8,18},{2,19},{6,20},{10,21},{5,22},{16,23},{20,24},{0,25},{7,26},{20,27},{11,28},{23,29},{16,30},{27,31},{4,32},{26,33},{21,34},{24,35},{0,36},{16,37},{9,38},{8,39},{19,40},{10,41},{39,42},{39,43},{42,44},{27,45},{4,46},{3,47},{39,48},{0,49},{40,50},{45,51},{21,52},{33,53},{40,54},{40,55},{7,56},{23,57},{9,58},{3,59},{35,60},{32,61},{56,62},{59,63},{9,64},{41,65},{58,66},{64,67},{54,68},{23,69},{21,70},{65,71},{22,72},{40,73},{16,74},{56,75},{62,76},{32,77},{17,78},{66,79},{24,80},{7,81},{29,82},{8,83},{80,84},{10,85},{16,86},{68,87},{83,88},{42,89},{40,90},{23,91},{7,92},{82,93},{66,94},{84,95},{23,96},{22,97},{11,98},{60,99},{11,100},{15,101},{67,102},{98,103},{51,104},{38,105},{94,106},{33,107},{92,108},{96,109},{104,110},{85,111},{75,112},{66,113},{108,114},{83,115},{71,116},{65,117},{92,118},{10,119},{35,120},{14,121},{98,122},{63,123},{93,124},{65,125},{24,126},{7,127},{13,128},{63,129},{111,130},{106,131},{73,132},{123,133},{12,134},{73,135},{72,136},{98,137},{42,138},{0,139},{13,140},{67,141},{112,142},{67,143},{55,144},{141,145},{1,146},{121,147},{70,148},{74,149},{149,150},{127,151},{4,152},{51,153},{135,154},{77,155},{47,156},{146,157},{72,158},{108,159},{39,160},{65,161},{157,162},{109,163},{65,164},{110,165},{106,166},{84,167},{22,168},{96,169},{32,170},{14,171},{86,172},{47,173},{36,174},{92,175},{110,176},{38,177},{54,178},{51,179},{53,180},{135,181},{165,182},{178,183},{154,184},{171,185},{155,186},{19,187},{163,188},{163,189},{188,190},{16,191},{73,192},{68,193},{38,194},{180,195},{120,196},{54,197},{9,198},{86,199},{19,200},{73,201},{2,202},{156,203},{170,204},{165,205},{10,206},{62,207},{100,208},{132,209},{47,210},{123,211},{175,212},{200,213},{6,214},{0,215},{8,216},{179,217},{109,218},{126,219},{151,220},{109,221},{63,222},{68,223},{140,224},{65,225},{55,226},{75,227},{32,228},{1,229},{93,230},{13,231},{219,232},{110,233},{48,234},{17,235},{24,236},{127,237},{43,238},{130,239},{14,240},{135,241},{154,242},{44,243},{130,244},{183,245},{143,246},{70,247},{146,248},{151,249},{187,250},{73,251},{5,252},{80,253},{168,254},{32,255},{240,256},{250,257},{207,258},{202,259},{151,260},{236,261},{153,262},{55,263},{121,264},{141,265},{37,266},{73,267},{6,268},{35,269},{217,270},{234,271},{128,272},{84,273},{73,274},{105,275},{141,276},{149,277},{265,278},{26,279},{213,280},{219,281},{157,282},{171,283},{31,284},{284,285},{8,286},{112,287},{264,288},{252,289},{225,290},{255,291},{287,292},{43,293},{2,294},{14,295},{106,296},{275,297},{104,298},{210,299},{66,300},{117,301},{116,302},{279,303},{61,304},{198,305},{198,306},{190,307},{8,308},{47,309},{288,310},{211,311},{261,312},{312,313},{38,314},{101,315},{251,316},{285,317},{192,318},{269,319},{137,320},{282,321},{68,322},{24,323},{194,324},{85,325},{261,326},{315,327},{57,328},{80,329},{93,330},{241,331},{166,332},{236,333},{62,334},{291,335},{217,336},{152,337},{132,338},{64,339},{123,340},{129,341},{165,342},{18,343},{341,344},{39,345},{76,346},{60,347},{132,348},{156,349},{346,350},{113,351},{283,352},{153,353},{256,354},{305,355},{234,356},{72,357},{312,358},{286,359},{259,360},{170,361},{213,362},{162,363},{261,364},{109,365},{139,366},{349,367},{57,368},{245,369},{56,370},{71,371},{314,372},{138,373},{273,374},{241,375},{217,376},{326,377},{23,378},{141,379},{149,380},{296,381},{78,382},{38,383},{258,384},{90,385},{30,386},{214,387},{245,388},{252,389},{47,390},{234,391},{76,392},{220,393},{194,394},{172,395},{122,396},{36,397},{341,398},{51,399},{225,400},{303,401},{69,402},{150,403},{118,404},{38,405},{398,406},{135,407},{231,408},{322,409},{120,410},{272,411},{332,412},{259,413},{80,414},{153,415},{67,416},{416,417},{414,418},{166,419},{301,420},{127,421},{262,422},{152,423},{407,424},{412,425},{288,426},{23,427},{315,428},{163,429},{316,430},{193,431},{4,432},{415,433},{118,434},{69,435},{413,436},{107,437},{390,438},{117,439},{296,440},{437,441},{312,442},{356,443},{68,444},{212,445},{131,446},{36,447},{417,448},{122,449},{294,450},{408,451},{104,452},{196,453},{27,454},{361,455},{136,456},{127,457},{350,458},{188,459},{55,460},{39,461},{70,462},{78,463},{87,464},{402,465},{306,466},{50,467},{48,468},{420,469},{196,470},{201,471},{154,472},{46,473},{340,474},{107,475},{137,476},{448,477},{204,478},{212,479},{257,480},{195,481},{193,482},{391,483},{45,484},{339,485},{156,486},{263,487},{444,488},{445,489},{264,490},{270,491},{134,492},{368,493},{195,494},{302,495},{397,496},{29,497},{437,498},{65,499},{103,500},{9,501},{299,502},{408,503},{249,504},{330,505},{493,506},{92,507},{354,508},{15,509},{124,510},{68,511},{1,512},{316,513},{374,514},{206,515},{499,516},{241,517},{116,518},{461,519},{294,520},{90,521},{231,522},{188,523},{220,524},{342,525},{122,526},{19,527},{347,528},{403,529},{38,530},{308,531},{78,532},{67,533},{445,534},{172,535},{88,536},{98,537},{197,538},{73,539},{405,540},{435,541},{135,542},{525,543},{534,544},{167,545},{353,546},{20,547},{532,548},{351,549},{252,550},{55,551},{419,552},{370,553},{431,554},{522,555},{116,556},{126,557},{121,558},{354,559},{468,560},{552,561},{219,562},{84,563},{390,564},{155,565},{446,566},{154,567},{292,568},{199,569},{428,570},{467,571},{437,572},{70,573},{509,574},{17,575},{18,576},{173,577},{356,578},{157,579},{443,580},{278,581},{352,582},{105,583},{71,584},{280,585},{256,586},{574,587},{496,588},{132,589},{255,590},{223,591},{381,592},{82,593},{300,594},{142,595},{249,596},{287,597},{323,598},{107,599},{384,600},{299,601},{362,602},{224,603},{34,604},{548,605},{420,606},{65,607},{416,608},{67,609},{414,610},{226,611},{572,612},{564,613},{244,614},{472,615},{109,616},{95,617},{297,618},{202,619},{175,620},{9,621},{285,622},{82,623},{473,624},{170,625},{30,626},{527,627},{128,628},{79,629},{339,630},{582,631},{481,632},{80,633},{39,634},{588,635},{632,636},{422,637},{174,638},{10,639},{164,640},{305,641},{361,642},{441,643},{627,644},{63,645},{133,646},{582,647},{618,648},{13,649},{391,650},{336,651},{649,652},{509,653},{27,654},{21,655},{221,656},{517,657},{75,658},{432,659},{232,660},{388,661},{111,662},{598,663},{523,664},{656,665},{192,666},{261,667},{535,668},{635,669},{401,670},{37,671},{129,672},{643,673},{583,674},{310,675},{463,676},{461,677},{440,678},{420,679},{649,680},{646,681},{388,682},{101,683},{602,684},{358,685},{189,686},{427,687},{461,688},{566,689},{556,690},{629,691},{239,692},{454,693},{653,694},{93,695},{489,696},{307,697},{53,698},{403,699},{639,700},{39,701},{474,702},{518,703},{28,704},{590,705},{285,706},{244,707},{26,708},{46,709},{546,710},{508,711},{391,712},{631,713},{332,714},{246,715},{146,716},{57,717},{108,718},{225,719},{139,720},{104,721},{4,722},{267,723},{638,724},{615,725},{505,726},{127,727},{631,728},{15,729},{728,730},{321,731},{236,732},{333,733},{303,734},{390,735},{632,736},{77,737},{28,738},{195,739},{175,740},{687,741},{735,742},{265,743},{391,744},{733,745},{408,746},{580,747},{501,748},{195,749},{61,750},{515,751},{94,752},{162,753},{695,754},{665,755},{666,756},{346,757},{708,758},{758,759},{490,760},{65,761},{394,762},{278,763},{462,764},{645,765},{393,766},{363,767},{154,768},{422,769},{726,770},{275,771},{682,772},{698,773},{659,774},{619,775},{101,776},{247,777},{218,778},{421,779},{195,780},{366,781},{220,782},{708,783},{88,784},{321,785},{777,786},{105,787},{477,788},{234,789},{625,790},{344,791},{406,792},{546,793},{56,794},{437,795},{41,796},{278,797},{123,798},{397,799},{101,800},{301,801},{581,802},{118,803},{547,804},{40,805},{365,806},{151,807},{207,808},{495,809},{533,810},{804,811},{809,812},{47,813},{504,814},{223,815},{45,816},{648,817},{226,818},{361,819},{201,820},{745,821},{701,822},{671,823},{62,824},{477,825},{476,826},{742,827},{25,828},{524,829},{441,830},{269,831},{574,832},{420,833},{767,834},{752,835},{714,836},{764,837},{498,838},{402,839},{23,840},{406,841},{121,842},{648,843},{633,844},{619,845},{478,846},{439,847},{323,848},{352,849},{51,850},{236,851},{624,852},{42,853},{460,854},{151,855},{406,856},{752,857},{664,858},{759,859},{263,860},{284,861},{774,862},{534,863},{552,864},{43,865},{551,866},{16,867},{655,868},{795,869},{376,870},{253,871},{825,872},{785,873},{664,874},{341,875},{840,876},{205,877},{664,878},{491,879},{75,880},{495,881},{690,882},{374,883},{460,884},{62,885},{230,886},{58,887},{675,888},{797,889},{59,890},{45,891},{589,892},{563,893},{224,894},{738,895},{680,896},{523,897},{662,898},{256,899},{498,900},{285,901},{891,902},{233,903},{410,904},{317,905},{621,906},{470,907},{470,908},{421,909},{732,910},{692,911},{27,912},{287,913},{311,914},{397,915},{639,916},{622,917},{554,918},{60,919},{601,920},{570,921},{517,922},{405,923},{840,924},{90,925},{738,926},{668,927},{65,928},{923,929},{266,930},{211,931},{252,932},{40,933},{40,934},{295,935},{301,936},{868,937},{425,938},{530,939},{123,940},{857,941},{823,942},{379,943},{567,944},{135,945},{448,946},{31,947},{507,948},{681,949},{237,950},{243,951},{747,952},{659,953},{436,954},{135,955},{704,956},{695,957},{89,958},{69,959},{248,960},{596,961},{635,962},{579,963},{831,964},{280,965},{712,966},{862,967},{759,968},{825,969},{102,970},{802,971},{164,972},{276,973},{970,974},{705,975},{226,976},{449,977},{577,978},{393,979},{47,980},{359,981},{615,982},{173,983},{918,984},{756,985},{731,986},{812,987},{322,988},{583,989},{131,990},{812,991},{753,992},{712,993},{826,994},{914,995},{460,996},{984,997},{931,998},{372,999},{916,1000},{59,1001},{530,1002},{278,1003},{979,1004},{85,1005},{705,1006},{350,1007},{465,1008},{161,1009},{246,1010},{525,1011},{146,1012},{797,1013},{684,1014},{961,1015},{525,1016},{946,1017},{973,1018},{1014,1019},{996,1020},{436,1021},{416,1022},{902,1023},{161,1024},{438,1025},{492,1026},{746,1027},{467,1028},{967,1029},{376,1030},{550,1031},{479,1032},{138,1033},{690,1034},{157,1035},{645,1036},{969,1037},{459,1038},{968,1039},{135,1040},{442,1041},{846,1042},{75,1043},{418,1044},{741,1045},{529,1046},{1013,1047},{845,1048},{376,1049},{876,1050},{945,1051},{679,1052},{118,1053},{351,1054},{186,1055},{662,1056},{55,1057},{897,1058},{150,1059},{732,1060},{647,1061},{824,1062},{136,1063},{84,1064},{9,1065},{234,1066},{656,1067},{147,1068},{399,1069},{875,1070},{962,1071},{905,1072},{950,1073},{433,1074},{219,1075},{190,1076},{809,1077},{163,1078},{689,1079},{713,1080},{844,1081},{630,1082},{971,1083},{536,1084},{992,1085},{579,1086},{1024,1087},{843,1088},{556,1089},{241,1090},{613,1091},{268,1092},{789,1093},{837,1094},{595,1095},{432,1096},{470,1097},{392,1098},{560,1099},{1083,1100},{1013,1101},{231,1102},{857,1103},{74,1104},{964,1105},{395,1106},{606,1107},{110,1108},{149,1109},{904,1110},{146,1111},{150,1112},{243,1113},{878,1114},{464,1115},{273,1116},{391,1117},{430,1118},{692,1119},{242,1120},{868,1121},{613,1122},{592,1123},{813,1124},{508,1125},{135,1126},{563,1127},{183,1128},{1096,1129},{1111,1130},{685,1131},{810,1132},{550,1133},{1,1134},{187,1135},{447,1136},{45,1137},{547,1138},{649,1139},{1126,1140},{54,1141},{243,1142},{141,1143},{1079,1144},{183,1145},{660,1146},{494,1147},{152,1148},{259,1149},{723,1150},{414,1151},{910,1152},{975,1153},{785,1154},{922,1155},{648,1156},{563,1157},{765,1158},{375,1159},{388,1160},{945,1161},{442,1162},{560,1163},{1097,1164},{1083,1165},{400,1166},{5,1167},{299,1168},{3,1169},{1045,1170},{552,1171},{597,1172},{1025,1173},{693,1174},{924,1175},{409,1176},{1170,1177},{63,1178},{146,1179},{503,1180},{1121,1181},{956,1182},{741,1183},{388,1184},{360,1185},{189,1186},{591,1187},{538,1188},{651,1189},{476,1190},{870,1191},{484,1192},{1101,1193},{837,1194},{489,1195},{366,1196},{1049,1197},{93,1198},{844,1199},{739,1200},{175,1201},{1061,1202},{330,1203},{1,1204},{1097,1205},{784,1206},{807,1207},{1024,1208},{953,1209},{408,1210},{340,1211}});
      expected = List.of(4);
      Assert.assertEquals(expected, actual);
    }

    @Test
    public void mergeTwoBinaryTrees() {
      TreeNode actual = BinaryTreeMania.mergeTrees(null, null);
      Assert.assertNull(actual);

      actual = BinaryTreeMania.mergeTrees(new TreeNode(2), null);
      Assert.assertEquals(2, actual.val);

      actual = BinaryTreeMania.mergeTrees(null, new TreeNode(3));
      Assert.assertEquals(3, actual.val);

      actual = BinaryTreeMania.mergeTrees(new TreeNode(2, new TreeNode(2)), new TreeNode(3));
      Assert.assertEquals(5, actual.val);
      Assert.assertEquals(2, actual.left.val);

      actual = BinaryTreeMania.mergeTrees(new TreeNode(4), new TreeNode(3, new TreeNode(2)));
      Assert.assertEquals(7, actual.val);
      Assert.assertEquals(2, actual.left.val);

      actual = BinaryTreeMania.mergeTrees(new TreeNode(4, null, new TreeNode(5)), new TreeNode(3, new TreeNode(2)));
      Assert.assertEquals(7, actual.val);
      Assert.assertEquals(2, actual.left.val);
      Assert.assertEquals(5, actual.right.val);
    }

    @Test
    public void diameterOfTheBinaryTree() {
      int actual = BinaryTreeMania.diameterOfBinaryTree(null);
      int expected = 0;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.diameterOfBinaryTree(new TreeNode(1));
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2)));
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2), new TreeNode(3)));
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3)));
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6))), new TreeNode(3, null, new TreeNode(7)))));
      expected = 5;
      Assert.assertEquals(expected, actual);
    }
    @Test
    public void minimumAbsDiffTwoNodesBST() {
      int actual = BinaryTreeMania.getMinimumDifference(new TreeNode(2, new TreeNode(1)));
      int expected = 1;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.getMinimumDifference(new TreeNode(3, new TreeNode(1), new TreeNode(4)));
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.getMinimumDifference(new TreeNode(13, new TreeNode(1), new TreeNode(25, new TreeNode(14), new TreeNode(30))));
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.getMinimumDifference(new TreeNode(4, new TreeNode(2, new TreeNode(0), new TreeNode(3)), new TreeNode(6)));
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.getMinimumDifference(new TreeNode(236, new TreeNode(104, null, new TreeNode(227)), new TreeNode(701, null, new TreeNode(911))));
      expected = 9;
      Assert.assertEquals(expected, actual);
    }
    @Test
    public void convertSortedArrayToBST() {
      TreeNode actual = BinaryTreeMania.sortedArrayToBST(new int[]{3});
      Assert.assertEquals(3, actual.val);
      Assert.assertNull(actual.left);
      Assert.assertNull(actual.right);

      actual = BinaryTreeMania.sortedArrayToBST(new int[]{3, 5});
      Assert.assertEquals(3, actual.val);
      Assert.assertNull(actual.left);
      Assert.assertEquals(5, actual.right.val);

      actual = BinaryTreeMania.sortedArrayToBST(new int[]{3, 5, 6});
      Assert.assertEquals(5, actual.val);
      Assert.assertEquals(3, actual.left.val);
      Assert.assertNull(actual.left.left);
      Assert.assertNull(actual.left.right);
      Assert.assertEquals(6, actual.right.val);
      Assert.assertNull(actual.right.left);
      Assert.assertNull(actual.right.right);

      actual = BinaryTreeMania.sortedArrayToBST(new int[]{3, 5, 6, 7});
      Assert.assertEquals(5, actual.val);
      Assert.assertEquals(3, actual.left.val);
      Assert.assertEquals(6, actual.right.val);
      Assert.assertEquals(7, actual.right.right.val);
      Assert.assertNull(actual.right.left);
      Assert.assertNull(actual.right.right.left);


      actual = BinaryTreeMania.sortedArrayToBST(new int[]{-1, 3, 5, 6, 7});
      Assert.assertEquals(5, actual.val);
      Assert.assertEquals(-1, actual.left.val);
      Assert.assertEquals(3, actual.left.right.val);
      Assert.assertEquals(6, actual.right.val);
      Assert.assertEquals(7, actual.right.right.val);

      actual = BinaryTreeMania.sortedArrayToBST(new int[]{-1, 2, 3, 5, 6, 7});
      Assert.assertEquals(3, actual.val);
      Assert.assertEquals(-1, actual.left.val);
      Assert.assertEquals(2, actual.left.right.val);
      Assert.assertEquals(6, actual.right.val);
      Assert.assertEquals(5, actual.right.left.val);
      Assert.assertEquals(7, actual.right.right.val);

      actual = BinaryTreeMania.sortedArrayToBST(new int[]{-1, 2, 3, 5, 6, 7, 8});
      Assert.assertEquals(5, actual.val);
      Assert.assertEquals(2, actual.left.val);
      Assert.assertEquals(-1, actual.left.left.val);
      Assert.assertEquals(3, actual.left.right.val);
      Assert.assertEquals(7, actual.right.val);
      Assert.assertEquals(6, actual.right.left.val);
      Assert.assertEquals(8, actual.right.right.val);
    }
    @Test
    public void testIfTreesAreSame() {
      boolean actual = BinaryTreeMania.isSameTree(null, null);
      Assert.assertTrue(actual);

      actual = BinaryTreeMania.isSameTree(null, new TreeNode(1));
      Assert.assertFalse(actual);

      actual = BinaryTreeMania.isSameTree(new TreeNode(4), null);
      Assert.assertFalse(actual);

      actual = BinaryTreeMania.isSameTree(new TreeNode(1, new TreeNode(2)), new TreeNode(1));
      Assert.assertFalse(actual);

      actual = BinaryTreeMania.isSameTree(new TreeNode(1), new TreeNode(1, null, new TreeNode(3)));
      Assert.assertFalse(actual);

      actual = BinaryTreeMania.isSameTree(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(7), new TreeNode(8))), new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(7), new TreeNode(8))));
      Assert.assertTrue(actual);

      actual = BinaryTreeMania.isSameTree(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(7), new TreeNode(8))), new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(7), new TreeNode(0))));
      Assert.assertFalse(actual);
    }
    @Test
    public void findDepthOfNaryTree() {
      int actual = BinaryTreeMania.maxDepth(null);
      int expected = 0;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.maxDepth(new NaryNode(1));
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.maxDepth(new NaryNode(1, List.of(new NaryNode(3))));
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.maxDepth(new NaryNode(1, List.of(new NaryNode(3), new NaryNode(4, List.of(new NaryNode(5))))));
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.maxDepth(new NaryNode(1, List.of(new NaryNode(3), new NaryNode(4, List.of(new NaryNode(5))))));
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.maxDepth(new NaryNode(1, List.of(new NaryNode(3), new NaryNode(4, List.of(new NaryNode(5))), new NaryNode(6, List.of(new NaryNode(4, List.of(new NaryNode(8))))))));
      expected = 4;
      Assert.assertEquals(expected, actual);
    }
    @Test
    public void checkIfTreeMirrorsItself() {
      boolean actual = BinaryTreeMania.isSymmetric(new TreeNode(1));
      Assert.assertTrue(actual);

      actual = BinaryTreeMania.isSymmetric(new TreeNode(1, new TreeNode(2)));
      Assert.assertFalse(actual);

      actual = BinaryTreeMania.isSymmetric(new TreeNode(1, null, new TreeNode(2)));
      Assert.assertFalse(actual);

      actual = BinaryTreeMania.isSymmetric(new TreeNode(1, new TreeNode(2), new TreeNode(2)));
      Assert.assertTrue(actual);

      actual = BinaryTreeMania.isSymmetric(new TreeNode(1, new TreeNode(2), new TreeNode(3)));
      Assert.assertFalse(actual);

      actual = BinaryTreeMania.isSymmetric(new TreeNode(1, new TreeNode(2, new TreeNode(5)), new TreeNode(2)));
      Assert.assertFalse(actual);

      actual = BinaryTreeMania.isSymmetric(new TreeNode(1, new TreeNode(2, new TreeNode(5), new TreeNode(3)), new TreeNode(2, new TreeNode(3), new TreeNode(5))));
      Assert.assertTrue(actual);

      actual = BinaryTreeMania.isSymmetric(new TreeNode(1, new TreeNode(2, new TreeNode(5), new TreeNode(3)), new TreeNode(2, new TreeNode(1), new TreeNode(5))));
      Assert.assertFalse(actual);
    }
    @Test
    public void distributeCoinsInBinaryTreeWithMinMoves() {
      int actual =  BinaryTreeMania.distributeCoins(null);
      int expected = 0;
      Assert.assertEquals(expected, actual);

      actual =  BinaryTreeMania.distributeCoins(new TreeNode(2, new TreeNode(0)));
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual =  BinaryTreeMania.distributeCoins(new TreeNode(3, new TreeNode(0), new TreeNode(0)));
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual =  BinaryTreeMania.distributeCoins(new TreeNode(3, new TreeNode(0, new TreeNode(0))));
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual =  BinaryTreeMania.distributeCoins(new TreeNode(0, new TreeNode(0, new TreeNode(3))));
      expected = 3;
      Assert.assertEquals(expected, actual);
    }
    @Test
    public void binaryTreeAlternateZigzagTraversal() {
      List<List<Integer>> actual  = BinaryTreeMania.zigzagLevelOrder(null);
      List<List<Integer>> expected = List.of();
      Assert.assertEquals(expected, actual);

      actual  = BinaryTreeMania.zigzagLevelOrder(new TreeNode(3));
      expected = List.of(List.of(3));
      Assert.assertEquals(expected, actual);

      actual  = BinaryTreeMania.zigzagLevelOrder(new TreeNode(3, new TreeNode(5), new TreeNode(6)));
      expected = List.of(List.of(3), List.of(6, 5));
      Assert.assertEquals(expected, actual);

      actual  = BinaryTreeMania.zigzagLevelOrder(new TreeNode(3, new TreeNode(5, new TreeNode(4), new TreeNode(7)), new TreeNode(6, null, new TreeNode(9))));
      expected = List.of(List.of(3), List.of(6, 5), List.of(4, 7, 9));
      Assert.assertEquals(expected, actual);

      actual  = BinaryTreeMania.zigzagLevelOrder(new TreeNode(3, new TreeNode(5, new TreeNode(4, new TreeNode(8), new TreeNode(11)), new TreeNode(7, new TreeNode(20), new TreeNode(13))), new TreeNode(6, null, new TreeNode(9))));
      expected = List.of(List.of(3), List.of(6, 5), List.of(4, 7, 9), List.of(13, 20, 11, 8));
      Assert.assertEquals(expected, actual);

      actual  = BinaryTreeMania.zigzagLevelOrder(new TreeNode(3, new TreeNode(5, new TreeNode(4, new TreeNode(8), new TreeNode(11)), new TreeNode(7, new TreeNode(20), new TreeNode(13))), new TreeNode(6, new TreeNode(14, new TreeNode(15), new TreeNode(16)), new TreeNode(9, new TreeNode(10), new TreeNode(21)))));
      expected = List.of(List.of(3), List.of(6, 5), List.of(4, 7, 14, 9), List.of(21, 10, 16, 15, 13, 20, 11, 8));
      Assert.assertEquals(expected, actual);
    }
    @Test
    public void binaryTreeMaxLevelSum() {
      int actual = BinaryTreeMania.maxLevelSum(new TreeNode(2));
      int expected = 1;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.maxLevelSum(new TreeNode(2, new TreeNode(-3), new TreeNode(6)));
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.maxLevelSum(new TreeNode(2, new TreeNode(-3, new TreeNode(4)), new TreeNode(6, null, new TreeNode(3))));
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.maxLevelSum(new TreeNode(2, new TreeNode(-3, new TreeNode(-3)), new TreeNode(6, null, new TreeNode(4))));
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = BinaryTreeMania.maxLevelSum(new TreeNode(-2, new TreeNode(-3, new TreeNode(-3)), new TreeNode(-6, null, new TreeNode(-4))));
      expected = 1;
      Assert.assertEquals(expected, actual);
    }
}