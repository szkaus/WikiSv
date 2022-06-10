package com.example.Pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.apache.commons.lang.math.NumberUtils;

public class WTextProcessor 

{
	
	//private static NumberUtils nut;

	public static void  wtextprocess()
	{
		
		
		String[] stopWrds=
	    {"a","able", "about", "above", "accordance", "according","accordingly","across",
	     "act", "actually", "added", "affected","affecting", "affects","after",
	     "afterwards","again","against","all", "almost","alone", "along","already",
	     "also","although","always","among","amongst", "an","and","another","any",
	     "anybody","anyhow","anymore","anyone","anything","anyway","anyways","anywhere",
	     "apparently","approximately","are","aren't","arise","around","as","aside",
	     "ask","asking","at","avaialble","away","awfully","back","be","became",
	     "because","become","becomes","becoming","been","before","beforehand","begin",
	     "beginning","beginnings","begins","behind","being","believe","below","beside",
	     "besides","between","beyond","both","brief","briefly", "but","by","came",
	     "can","cannot","can't","cause","causes","certain","certainly","com","come",
	     "contain","containing","contains","could","couldn't","date","didn't","did",
	     "different","do","does","doesn't","doing","done"," don't", "down", "downwards",
	     "due","during","each","edu","effect","eg","eight","eighty","either",
	     "else","elsewhere","end","ending","enough","especially","et", "et-al",
	     "etc","even","ever","every","everybody"," everyone"," everything",
	     "everywhere","ex","except","far","few","fifth", "first","five","fix",
	     "followed","following","follows","for","former","formerly","forth","found",
	     "four","from","further","furthermore","gave","get","gets","getting","give",
	     "given","gives","giving","go","goes","gone","got","gotten","had",
	     "happens","hardly","has","hasn't","have","haven't","having"," he"," hence",
	     "her","here","hereafter","hereby","herein","hereupon","herself","hi","him",
	     "hid","himself","his","hither","how","howbeit"," however","hundred","i",
	     "id","ie","if","immediate","immediately","importance","important",
	     "in","inc","indeed","index","information","instead","into","invention",
	     "inward","is","isn't","it","it'll","its","itself","just","keep","keeps",
	     "kept","kg","km","know","known","knows","largely","last","lately","later",
	     "latter","latterly","least","less","lest","let","lets","like","liked",
	     "likely","line","little","'ll","look","looking","looks","ltd","made",
	     "mainly","make","makes","many","may","maybe","me","mean","means","meantime",
	     "meanwhile","merely","mg","might","million","miss","ml","more","moreover",
	     "most","mostly","much","mug","must","name","namely","near","nearly",
	     "necessarily","necessary","need","needs","neither","never","nevertheless",
	     "new","next","nine","ninety","no","nobody","none","nonetheless","nor",
	     "normally","not","noted","nothing","now","nowhere","obtain","obtained",
	     "obviously","of","off"," often","ok","okay","old","omit","omitted","on",
	     "once","one","ones","only","onto","or","other","others","otherwise","ought",
	    "our","ours","ourselves","out","outside","over","overall","owing","own","page",
	     "pages","part","particular","particularly","past","per","perhaps","placed",
	     "please","plus","poorly","possible","possibly","potentially"," pp",
	     "predominantly","present","previously","primarily","probably","promptly",
	     "provides","put","quickly","quite","ran","rather","readily","really","recent",
	     "recently","ref","refs","regarding","regardless","regards","related",
	     "relatively","research","respectively","resulted","resulting","results",
	     "right","run","said","same","saw","say","saying","says","sec","section","see",
	     "seeing","seem","seemed","seeming","seems","seen","self","selves","sent",
	     "seven","several","shall","she","she'll","should","shouldn't","show","showed",
	     "shown","shows","significant","significantly","similar","similarly","since",
	     "six","slightly","so","some","somebody","somehow","someone","something",
	     "sometime","sometimes","somewhat","somewhere","soon","sorry","specifically",
	     "specified","specify","specifying","still","stop","strongly","sub",
	     "substantially","successfully","such","sufficiently","suggest","sure","surely",
	     "take","taken","taking","talk","talking","tell","tends","than","thank",
	     "thanks","that","that'll","thats","that've","the","their","theirs","them",
	     "themselves","then","there","thereafter","thereby","therefore","therein",
	     "there'll","thereof","","thereto","thereupon","there've","these","they",
	     "they'll","they've","think","this","those","though","through","throughout",
	     " thru","thus","til","tip","to","together","too","took","toward","towards",
	     "tried","tries","truly","try","trying","twice","two","under","unfortunately",
	     "unless","unlike","unlikely","until","unto","up","upon","ups","us","use",
	     "used","useful","usefully","usefulness","uses","using","usually","value",
	     "various","very","via","vs","want","wants","was","wasn't","way","we","welcome",
	     "we'll","went","were","weren't","we've","what","whatever","what'll","whats",
	     "when","whence","whenever","where","whereafter","whereas","whereby","wherein",
	     "whereas","whereupon","wherever","whether","which","while","whim","whither",
	     "who","whoever","whole","who'll","whom","whomever","whose","why","widely",
	     "willing","wish","with","within","without","wont","won't","words","world",
	     "would","would'nt","www","x","y","yes","yet","you","your","yours","yourself",
	     "z","zero","north","south","east", "west", "retrieve", "retrieved", "january",
	     "february","march","april","may","june","july","august","semptember",
	     "october","november","december","isbn","archived","original","large","ownership",
	     "nil"};

				try{
				Scanner fip1=new Scanner(new File("bushfire/"+"Household.txt")); //file here from which you want to remove the stop words
				//Scanner fip1=new Scanner(new File("servicefiles/"+ filename + ".txt"));
				FileOutputStream out=new FileOutputStream("bushfire/"+"removedstopwordshousehold.txt");
				//FileOutputStream out=new FileOutputStream("servicefiles/"+"removedstopwordshousehold.txt");
                 
				while(fip1.hasNext())
				{
				int flag=1;
				String s1=fip1.next();
				s1=s1.toLowerCase();
				for(int i=0;i<stopWrds.length;i++){
				if(s1.equals(stopWrds[i]))
				{
				flag=0;
				}
				}
				if(flag!=0)
				{
				
				System.out.println(s1);
				PrintStream p=new PrintStream(out);
				p.println(s1);
				
				}

				}
                fip1.close();
				out.close();
				System.out.println("Function End ------------------------");
				}
				catch(Exception e)
				{
				System.err.println("cannot read file");
				}
				
				
		
	}

}




