/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.netbeans.validation.api.builtin.stringvalidation;

import org.netbeans.validation.api.Problems;

/**
 *
 * @author tpm_paucasesnovescif
 */
public class UpperCaseValidation extends StringValidator
{

    @Override
    public void validate(Problems problems, String compName, String textToValidate)
    {
      if(!"".equals(textToValidate) && !Character.isUpperCase(textToValidate.charAt(0)))
      {
          problems.add("Field "+ compName + "Must begin with an uppercase." );
      }
    }
    
}
