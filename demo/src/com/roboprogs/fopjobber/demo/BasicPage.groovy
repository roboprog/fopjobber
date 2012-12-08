
package com.roboprogs.fopjobber.demo

outf = new File( "test_output/basic_page.fo.xml")

// <?xml version="1.0" encoding="ISO-8859-1"?>
outf.write """

<fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">

<fo:layout-master-set>
	<fo:simple-page-master page-height="11in" page-width="8.5in"
			margin-top=".25in" margin-bottom=".25in"
			margin-left=".5in" margin-right=".5in"
			master-name="BasicPage">

		<fo:region-body background-color="#ffffff"
				margin-top="1.0625in" margin-bottom=".5625in"
				margin-left=".3125in" margin-right=".3125in" 
				/>

		<fo:region-before background-color="#cccccc" extent="1.0in"/>
		<fo:region-after background-color="#cccccc" extent=".5in"/>
		<fo:region-start background-color="#cccc77" extent=".25in"
				reference-orientation="270"/>
		<fo:region-end background-color="#cccc77" extent=".25in"
				reference-orientation="90"/>
	</fo:simple-page-master>
</fo:layout-master-set>

<fo:page-sequence master-reference="BasicPage">

	<fo:static-content flow-name="xsl-region-before">
		<fo:block font-size="15pt" text-align="center">Document Title</fo:block>
	</fo:static-content>
	<fo:static-content flow-name="xsl-region-after">
		<fo:block font-family="sans-serif" font-size="8pt" text-align="right">page footer</fo:block>
	</fo:static-content>

	<fo:static-content flow-name="xsl-region-start">
		<fo:block font-size="8pt" text-align="center">left margin</fo:block>
	</fo:static-content>
	<fo:static-content flow-name="xsl-region-end">
		<fo:block font-size="8pt" text-align="center">right margin</fo:block>
	</fo:static-content>

	<fo:flow flow-name="xsl-region-body">
		<fo:block font-size="10pt">Hello, world!</fo:block>
	</fo:flow>

</fo:page-sequence>

</fo:root>
""";

// vi: ts=4 sw=4