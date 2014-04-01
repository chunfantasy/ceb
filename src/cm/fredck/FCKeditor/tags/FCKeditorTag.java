package cm.fredck.FCKeditor.tags;

import com.fredck.FCKeditor.FCKeditor;
import com.fredck.FCKeditor.FCKeditorConfigurations;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class FCKeditorTag extends BodyTagSupport
{
  private String id;
  private String value;
  private String basePath;
  private String toolbarSet;
  private String width;
  private String height;
  private String customConfigurationsPath;
  private String editorAreaCSS;
  private String baseHref;
  private String skinPath;
  private String pluginsPath;
  private String fullPage;
  private String debug;
  private String autoDetectLanguage;
  private String defaultLanguage;
  private String contentLangDirection;
  private String enableXHTML;
  private String enableSourceXHTML;
  private String fillEmptyBlocks;
  private String formatSource;
  private String formatOutput;
  private String formatIndentator;
  private String geckoUseSPAN;
  private String startupFocus;
  private String forcePasteAsPlainText;
  private String forceSimpleAmpersand;
  private String tabSpaces;
  private String useBROnCarriageReturn;
  private String toolbarStartExpanded;
  private String toolbarCanCollapse;
  private String fontColors;
  private String fontNames;
  private String fontSizes;
  private String fontFormats;
  private String stylesXmlPath;
  private String linkBrowserURL;
  private String imageBrowserURL;
  private String flashBrowserURL;
  private String linkUploadURL;
  private String imageUploadURL;
  private String flashUploadURL;
  protected FCKeditor fcked;

  public FCKeditorTag()
  {
    this.value = "";
    this.basePath = null;
    this.toolbarSet = null;
    this.width = null;
    this.height = null;
    this.customConfigurationsPath = null;
    this.editorAreaCSS = null;
    this.baseHref = null;
    this.skinPath = null;
    this.pluginsPath = null;
    this.fullPage = null;
    this.debug = null;
    this.autoDetectLanguage = null;
    this.defaultLanguage = null;
    this.contentLangDirection = null;
    this.enableXHTML = null;
    this.enableSourceXHTML = null;
    this.fillEmptyBlocks = null;
    this.formatSource = null;
    this.formatOutput = null;
    this.formatIndentator = null;
    this.geckoUseSPAN = null;
    this.startupFocus = null;
    this.forcePasteAsPlainText = null;
    this.forceSimpleAmpersand = null;
    this.tabSpaces = null;
    this.useBROnCarriageReturn = null;
    this.toolbarStartExpanded = null;
    this.toolbarCanCollapse = null;
    this.fontColors = null;
    this.fontNames = null;
    this.fontSizes = null;
    this.fontFormats = null;
    this.stylesXmlPath = null;
    this.linkBrowserURL = null;
    this.imageBrowserURL = null;
    this.flashBrowserURL = null;
    this.linkUploadURL = null;
    this.imageUploadURL = null;
    this.flashUploadURL = null;

    this.fcked = null;
  }

  public void setId(String value)
  {
    this.id = value;
  }

  public void setBasePath(String value)
  {
    this.basePath = value;
  }

  public void setToolbarSet(String value)
  {
    this.toolbarSet = value;
  }

  public void setWidth(String value)
  {
    this.width = value;
  }

  public void setHeight(String value)
  {
    this.height = value;
  }

  public void setCustomConfigurationsPath(String value)
  {
    this.customConfigurationsPath = value;
  }

  public void setEditorAreaCSS(String value)
  {
    this.editorAreaCSS = value;
  }

  public void setBaseHref(String value)
  {
    this.baseHref = value;
  }

  public void setSkinPath(String value)
  {
    this.skinPath = value;
  }

  public void setPluginsPath(String value)
  {
    this.pluginsPath = value;
  }

  public void setFullPage(String value)
    throws JspException
  {
    if ((!(value.equals("true"))) && (!(value.equals("false"))))
      throw new JspException("fullPage attribute can only be true or false");
    this.fullPage = value;
  }

  public void setDebug(String value)
    throws JspException
  {
    if ((!(value.equals("true"))) && (!(value.equals("false"))))
      throw new JspException("debug attribute can only be true or false");
    this.debug = value;
  }

  public void setAutoDetectLanguage(String value)
    throws JspException
  {
    if ((!(value.equals("true"))) && (!(value.equals("false"))))
      throw new JspException("autoDetectLanguage attribute can only be true or false: here was " + value);
    this.autoDetectLanguage = value;
  }

  public void setDefaultLanguage(String value)
  {
    this.defaultLanguage = value;
  }

  public void setContentLangDirection(String value)
    throws JspException
  {
    if ((!(value.equals("true"))) && (!(value.equals("false"))))
      throw new JspException("debug attribute can only be ltr or rtl");
    this.contentLangDirection = value;
  }

  public void setEnableXHTML(String value)
    throws JspException
  {
    if ((!(value.equals("true"))) && (!(value.equals("false"))))
      throw new JspException("enableXHTML attribute can only be true or false");
    this.enableXHTML = value;
  }

  public void setEnableSourceXHTML(String value)
    throws JspException
  {
    if ((!(value.equals("true"))) && (!(value.equals("false"))))
      throw new JspException("enableSourceXHTML attribute can only be true or false");
    this.enableSourceXHTML = value;
  }

  public void setFillEmptyBlocks(String value)
    throws JspException
  {
    if ((!(value.equals("true"))) && (!(value.equals("false"))))
      throw new JspException("fillEmptyBlocks attribute can only be true or false");
    this.fillEmptyBlocks = value;
  }

  public void setFormatSource(String value)
    throws JspException
  {
    if ((!(value.equals("true"))) && (!(value.equals("false"))))
      throw new JspException("formatSource attribute can only be true or false");
    this.formatSource = value;
  }

  public void setFormatOutput(String value)
    throws JspException
  {
    if ((!(value.equals("true"))) && (!(value.equals("false"))))
      throw new JspException("formatOutput attribute can only be true or false");
    this.formatOutput = value;
  }

  public void setFormatIndentator(String value)
  {
    this.formatIndentator = value;
  }

  public void setGeckoUseSPAN(String value)
    throws JspException
  {
    if ((!(value.equals("true"))) && (!(value.equals("false"))))
      throw new JspException("GeckoUseSPAN attribute can only be true or false");
    this.geckoUseSPAN = value;
  }

  public void setStartupFocus(String value)
    throws JspException
  {
    if ((!(value.equals("true"))) && (!(value.equals("false"))))
      throw new JspException("startupFocus attribute can only be true or false");
    this.startupFocus = value;
  }

  public void setForcePasteAsPlainText(String value)
    throws JspException
  {
    if ((!(value.equals("true"))) && (!(value.equals("false"))))
      throw new JspException("forcePasteAsPlainText attribute can only be true or false");
    this.forcePasteAsPlainText = value;
  }

  public void setForceSimpleAmpersand(String value)
    throws JspException
  {
    if ((!(value.equals("true"))) && (!(value.equals("false"))))
      throw new JspException("forceSimpleAmpersand attribute can only be true or false");
    this.forceSimpleAmpersand = value;
  }

  public void setTabSpaces(String value)
  {
    this.tabSpaces = value;
  }

  public void setUseBROnCarriageReturn(String value)
    throws JspException
  {
    if ((!(value.equals("true"))) && (!(value.equals("false"))))
      throw new JspException("useBROnCarriageReturn attribute can only be true or false");
    this.useBROnCarriageReturn = value;
  }

  public void setToolbarStartExpanded(String value)
    throws JspException
  {
    if ((!(value.equals("true"))) && (!(value.equals("false"))))
      throw new JspException("ToolbarStartExpanded attribute can only be true or false");
    this.toolbarStartExpanded = value;
  }

  public void setToolbarCanCollapse(String value)
    throws JspException
  {
    if ((!(value.equals("true"))) && (!(value.equals("false"))))
      throw new JspException("ToolbarCanCollapse attribute can only be true or false");
    this.toolbarCanCollapse = value;
  }

  public void setFontColors(String value)
  {
    this.fontColors = value;
  }

  public void setFontNames(String value)
  {
    this.fontNames = value;
  }

  public void setFontSizes(String value)
  {
    this.fontSizes = value;
  }

  public void setFontFormats(String value)
  {
    this.fontFormats = value;
  }

  public void setStylesXmlPath(String value)
  {
    this.stylesXmlPath = value;
  }

  public void setLinkBrowserURL(String value)
  {
    this.linkBrowserURL = value;
  }

  public void setImageBrowserURL(String value)
  {
    this.imageBrowserURL = value;
  }

  public void setFlashBrowserURL(String value)
  {
    this.flashBrowserURL = value;
  }

  public void setLinkUploadURL(String value)
  {
    this.linkUploadURL = value;
  }

  public void setImageUploadURL(String value)
  {
    this.imageUploadURL = value;
  }

  public void setFlashUploadURL(String value)
  {
    this.flashUploadURL = value;
  }

  public int doStartTag()
    throws JspException
  {
    this.fcked = new FCKeditor((HttpServletRequest)this.pageContext.getRequest(), this.id);
    if (this.toolbarSet != null)
      this.fcked.setToolbarSet(this.toolbarSet);
    if (this.basePath != null)
      this.fcked.setBasePath(this.basePath);
    if (this.width != null)
      this.fcked.setWidth(this.width);
    if (this.height != null)
      this.fcked.setHeight(this.height);
    if (this.customConfigurationsPath != null)
      this.fcked.getConfig().put("CustomConfigurationsPath", this.customConfigurationsPath);
    if (this.editorAreaCSS != null)
      this.fcked.getConfig().put("EditorAreaCSS", this.editorAreaCSS);
    if (this.baseHref != null)
      this.fcked.getConfig().put("BaseHref", this.baseHref);
    if (this.skinPath != null)
      this.fcked.getConfig().put("SkinPath", this.skinPath);
    if (this.pluginsPath != null)
      this.fcked.getConfig().put("PluginsPath", this.pluginsPath);
    if (this.fullPage != null)
      this.fcked.getConfig().put("FullPage", this.fullPage);
    if (this.debug != null)
      this.fcked.getConfig().put("Debug", this.debug);
    if (this.autoDetectLanguage != null)
      this.fcked.getConfig().put("AutoDetectLanguage", this.autoDetectLanguage);
    if (this.defaultLanguage != null)
      this.fcked.getConfig().put("DefaultLanguage", this.defaultLanguage);
    if (this.contentLangDirection != null)
      this.fcked.getConfig().put("ContentLangDirection", this.contentLangDirection);
    if (this.enableXHTML != null)
      this.fcked.getConfig().put("EnableXHTML", this.enableXHTML);
    if (this.enableSourceXHTML != null)
      this.fcked.getConfig().put("EnableSourceXHTML", this.enableSourceXHTML);
    if (this.fillEmptyBlocks != null)
      this.fcked.getConfig().put("FillEmptyBlocks", this.fillEmptyBlocks);
    if (this.formatSource != null)
      this.fcked.getConfig().put("FormatSource", this.formatSource);
    if (this.formatOutput != null)
      this.fcked.getConfig().put("FormatOutput", this.formatOutput);
    if (this.formatIndentator != null)
      this.fcked.getConfig().put("FormatIndentator", this.formatIndentator);
    if (this.geckoUseSPAN != null)
      this.fcked.getConfig().put("GeckoUseSPAN", this.geckoUseSPAN);
    if (this.startupFocus != null)
      this.fcked.getConfig().put("StartupFocus", this.startupFocus);
    if (this.forcePasteAsPlainText != null)
      this.fcked.getConfig().put("ForcePasteAsPlainText", this.forcePasteAsPlainText);
    if (this.forceSimpleAmpersand != null)
      this.fcked.getConfig().put("ForceSimpleAmpersand", this.forceSimpleAmpersand);
    if (this.tabSpaces != null)
      this.fcked.getConfig().put("TabSpaces", this.tabSpaces);
    if (this.useBROnCarriageReturn != null)
      this.fcked.getConfig().put("UseBROnCarriageReturn", this.useBROnCarriageReturn);
    if (this.toolbarStartExpanded != null)
      this.fcked.getConfig().put("ToolbarStartExpanded", this.toolbarStartExpanded);
    if (this.toolbarCanCollapse != null)
      this.fcked.getConfig().put("ToolbarCanCollapse", this.toolbarCanCollapse);
    if (this.fontColors != null)
      this.fcked.getConfig().put("FontColors", this.fontColors);
    if (this.fontNames != null)
      this.fcked.getConfig().put("FontNames", this.fontNames);
    if (this.fontSizes != null)
      this.fcked.getConfig().put("FontSizes", this.fontSizes);
    if (this.fontFormats != null)
      this.fcked.getConfig().put("FontFormats", this.fontFormats);
    if (this.stylesXmlPath != null)
      this.fcked.getConfig().put("StylesXmlPath", this.stylesXmlPath);
    if (this.linkBrowserURL != null)
      this.fcked.getConfig().put("LinkBrowserURL", this.linkBrowserURL);
    if (this.imageBrowserURL != null)
      this.fcked.getConfig().put("ImageBrowserURL", this.imageBrowserURL);
    if (this.flashBrowserURL != null)
      this.fcked.getConfig().put("FlashBrowserURL", this.flashBrowserURL);
    if (this.linkUploadURL != null)
      this.fcked.getConfig().put("LinkUploadURL", this.linkUploadURL);
    if (this.imageUploadURL != null)
      this.fcked.getConfig().put("ImageUploadURL", this.imageUploadURL);
    if (this.flashUploadURL != null)
      this.fcked.getConfig().put("FlashUploadURL", this.flashUploadURL);

    return 2;
  }

  public int doAfterBody()
    throws JspException
  {
    BodyContent body = getBodyContent();
    JspWriter writer = body.getEnclosingWriter();
    String bodyString = body.getString();
    this.fcked.setValue(bodyString);
    try {
      writer.println(this.fcked.create());
    } catch (IOException ioe) {
      throw new JspException("Error: IOException while writing to the user");
    }

    return 0;
  }
}