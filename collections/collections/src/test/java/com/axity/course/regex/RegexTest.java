package com.axity.course.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegexTest
{

  @Test
  public void anclaInicial()
  {
    String regex = "^Cast(\\w)*";
    Pattern pattern = Pattern.compile( regex );
    Matcher matcher = pattern.matcher( "Castor" );
    System.out.println( matcher.matches() );
    System.out.println( Pattern.matches( regex, "Castor" ) );
    System.out.println( Pattern.matches( regex, "Cast" ) );
    System.out.println( Pattern.matches( regex, "Castillo" ) );
    System.out.println( Pattern.matches( regex, "Cas" ) );
  }

  @Test
  public void anclaFinal()
  {
    String regex = "(\\w)*ing$";
    System.out.println( Pattern.matches( regex, "Living" ) );
    System.out.println( Pattern.matches( regex, "Studying" ) );
    System.out.println( Pattern.matches( regex, "Playing" ) );
    System.out.println( Pattern.matches( regex, "Sing" ) );
    System.out.println( Pattern.matches( regex, "Song" ) );
  }

  @Test
  public void anclaInicialFinal()
  {
    String regex = "^Casting$";
    System.out.println( Pattern.matches( regex, "Casting" ) );
    System.out.println( Pattern.matches( regex, "Living" ) );
    System.out.println( Pattern.matches( regex, "Playing" ) );
    System.out.println( Pattern.matches( regex, "Sing" ) );
    System.out.println( Pattern.matches( regex, "Song" ) );
  }

  @Test
  public void cuantificadores1()
  {
    String regex = "abc*";
    String[] words = { "a", "ab", "abc", "abcc", "abccc", "abcd" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }

  }

  @Test
  public void cuantificadores2()
  {
    String regex = "abc+";
    String[] words = { "a", "ab", "abc", "abcc", "abccc", "abcd" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }

  }

  @Test
  public void cuantificadores3()
  {
    String regex = "abc{2}";
    String[] words = { "a", "ab", "abc", "abcc", "abccc", "abcd" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }
  }

  @Test
  public void cuantificadores4()
  {
    String regex = "abc{2,}";
    String[] words = { "a", "ab", "abc", "abcc", "abccc", "abcd" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }
  }

  @Test
  public void cuantificadores5()
  {
    String regex = "abc{2,5}";
    String[] words = { "a", "ab", "abc", "abcc", "abccc", "abcccc", "abccccc", "abcccccc" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }
  }

  @Test
  public void cuantificadores6()
  {
    String regex = "a(bc)*";
    String[] words = { "a", "ab", "abc", "abcbc", "abcbcbc", "abcbcbcbc", "abcbcbcbcbc" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }
  }

  @Test
  public void operadorOr()
  {
    String regex = "a(b|c)";
    String[] words = { "a", "ab", "abc", "ac", "aca" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }
  }

  @Test
  public void operadorOr2()
  {
    String regex = "a[bc]";
    String[] words = { "a", "ab", "abc", "ac", "aca" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }
  }

  @Test
  public void characterClassesDigits1()
  {
    String regex = "(\\d)*";
    String[] words = { "", "a", "1", "123", "99999" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }
  }

  @Test
  public void characterClassesDigits2()
  {
    String regex = "(\\d){3,5}";
    String[] words = { "", "123", "1234", "12345", "99999", "012345" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }
  }

  @Test
  public void characterClassesWord1()
  {
    String regex = "(\\w){3,5}";
    String[] words = { "abc", "abc_", "ABC", "a_b_c", "a1b2", "añb" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }
  }

  @Test
  public void characterClassesSpaces()
  {
    String regex = "a(\\s)b";
    String[] words = { "a c", "a\tb", "a\nb", "ab", "a  b" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }
  }

  @Test
  public void characterClassesAny()
  {
    String regex = "a...e";
    String[] words = { "a123e", "a1$3e", "a1_be", "aáñée", "aABCe" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }
  }

  @Test
  public void brackets1()
  {
    String regex = "[abc]";
    String[] words = { "a", "b", "c", "d", "e", "aa" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }
  }

  @Test
  public void brackets2()
  {
    String regex = "[a-c]"; // [abc] [a|b|c]
    String[] words = { "a", "b", "c", "d", "e", "aa" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }
  }

  @Test
  public void brackets3()
  {
    String regex = "[a-c]"; // [abc] [a|b|c]
    String[] words = { "a", "b", "c", "d", "e", "aa" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }
  }

  @Test
  public void curp()
  {
    String regex = "^[A-Z]{1}[AEIOU]{1}[A-Z]{2}" //
        + "[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])" //
        + "[HM]{1}" //
        + "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)"
        + "[B-DF-HJ-NP-TV-Z]{3}" //
        + "[0-9A-Z]{1}" //
        + "[0-9]{1}$";
    String[] words = { "NERV800204ZZ4", "NERV800204HDFZZF09" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }
  }
  
  @Test
  public void rfc()
  {
    String regex = "^([A-Z,Ñ,&]{3,4}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])[A-Z|\\d]{3})$";
    String[] words = { "NERV800204ZZ4", "NERV800204HDFZZF09" };
    for( String word : words )
    {
      System.out.println( word + " -> " + Pattern.matches( regex, word ) );
    }
  }
}
