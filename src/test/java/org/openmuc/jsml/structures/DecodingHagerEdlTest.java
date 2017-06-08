/*
 * Copyright 2009-14 Fraunhofer ISE
 *
 * This file is part of jSML.
 * For more information visit http://www.openmuc.org
 *
 * jSML is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * jSML is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with jSML.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.openmuc.jsml.structures;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class DecodingHagerEdlTest {

	public static byte[] hexStringToByteArray(String s) {
		int len = s.length();
		byte[] data = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
		}
		return data;
	}

	@Test
	public void decodeTimeTagMessage() throws IOException {

		byte[] message = hexStringToByteArray("76090000000000042DD9620162007263010176010109000000000001649E0B0901484147003B9EF99801016368590076090000000000042DDA620162007263070177010B0901484147003B9EF998070100620AFFFF72620164016FB4F17977078181C78203FF01010101044841470177070100000009FF010101010B0901484147003B9EF9980177070100010800FF620001621E52FF5354AF0177070100010801FF0101621E52FF532D9F0177070100010802FF0101621E52FF5327100177070100020800FF620001621E52FF534E200177070100020801FF0101621E52FF5327100177070100020802FF0101621E52FF5327100177070100100700FF0101621B52005300000177070100240700FF0101621B52FF53000001770701001F0700FF0101622152FE5300010177070100200700FF0101622352FE535B9C0177070100380700FF0101621B52FF5300000177070100330700FF0101622152FE5300010177070100340700FF0101622352FE535BF901770701004C0700FF0101621B52FF5300000177070100470700FF0101622152FE5300010177070100480700FF0101622352FE535B250177070100603200020101620952FF5300EF0177078181C78205FF01010101830219B76F92A0A9357CED64AAD5D468E49DFF54CAC99748228F5EA13B458EF104B7CF49A9A6ECB9134F406C03C9C31ACF6801770701006032030301016223520062D601770701006032030401016223520062EF01770701006032000301016209520052100177070100603200040101620952005223017707010060320005010162095200521B010101639A5A0076090000000000042DDB62016200726302017101638ED1007605023F4FC762006200726301017601010500BFC5410B0649534B0104CEE5520E010163C08E007605023F4FC8620062007263070177010B0649534B0104CEE5520E070100620AFFFF72620165010F66B17A77078181C78203FF010101010449534B0177070100000009FF010101010B0649534B0104CEE5520E0177070100010800FF65000101A201621E52FF590000000000F6F7790177070100010801FF0101621E52FF590000000000F6F7790177070100010802FF0101621E52FF5900000000000000000177070100020800FF65000101A201621E52FF5900000000012350F40177070100020801FF0101621E52FF5900000000012350F40177070100020802FF0101621E52FF5900000000000000000177070100100700FF0101621B520055FFFFFA990177078181C78205FF010101018302E66A04A0C6D45090399F2D4A701B8B0C58D6F00B6F3152F705C509A80E326D2B34974100E47706C4EAA66365C4BA33FA01010163E45A007605023F4FC96200620072630201710163A5560076090000000000042DD9620162007263010176010109000000000001649E0B0901484147003B9EF99801016368590076090000000000042DDA620162007263070177010B0901484147003B9EF998070100620AFFFF72620164016FB4F17977078181C78203FF01010101044841470177070100000009FF010101010B0901484147003B9EF9980177070100010800FF620001621E52FF5354AF0177070100010801FF0101621E52FF532D9F0177070100010802FF0101621E52FF5327100177070100020800FF620001621E52FF534E200177070100020801FF0101621E52FF5327100177070100020802FF0101621E52FF5327100177070100100700FF0101621B52005300000177070100240700FF0101621B52FF53000001770701001F0700FF0101622152FE5300010177070100200700FF0101622352FE535B9C0177070100380700FF0101621B52FF5300000177070100330700FF0101622152FE5300010177070100340700FF0101622352FE535BF901770701004C0700FF0101621B52FF5300000177070100470700FF0101622152FE5300010177070100480700FF0101622352FE535B250177070100603200020101620952FF5300EF0177078181C78205FF01010101830219B76F92A0A9357CED64AAD5D468E49DFF54CAC99748228F5EA13B458EF104B7CF49A9A6ECB9134F406C03C9C31ACF6801770701006032030301016223520062D601770701006032030401016223520062EF01770701006032000301016209520052100177070100603200040101620952005223017707010060320005010162095200521B010101639A5A0076090000000000042DDB62016200726302017101638ED1007605023F4FC762006200726301017601010500BFC5410B0649534B0104CEE5520E010163C08E007605023F4FC8620062007263070177010B0649534B0104CEE5520E070100620AFFFF72620165010F66B17A77078181C78203FF010101010449534B0177070100000009FF010101010B0649534B0104CEE5520E0177070100010800FF65000101A201621E52FF590000000000F6F7790177070100010801FF0101621E52FF590000000000F6F7790177070100010802FF0101621E52FF5900000000000000000177070100020800FF65000101A201621E52FF5900000000012350F40177070100020801FF0101621E52FF5900000000012350F40177070100020802FF0101621E52FF5900000000000000000177070100100700FF0101621B520055FFFFFA990177078181C78205FF010101018302E66A04A0C6D45090399F2D4A701B8B0C58D6F00B6F3152F705C509A80E326D2B34974100E47706C4EAA66365C4BA33FA01010163E45A007605023F4FC96200620072630201710163A55600");

		DataInputStream is = new DataInputStream(new ByteArrayInputStream(message));

		SML_Message smlMessage = new SML_Message();
		Assert.assertTrue(smlMessage.decodeAndCheck(is));

		smlMessage = new SML_Message();
		Assert.assertTrue(smlMessage.decodeAndCheck(is));

		SML_GetListRes getListRes = (SML_GetListRes) smlMessage.getMessageBody().getChoice();
		for (SML_ListEntry listEntry : getListRes.getValList().getValListEntry()) {
			if (listEntry.getValTime().isSelected()) {
				if (listEntry.getValTime().getTag().getVal() == 3) {
					// System.out.println("timestamp: "
					// + ((SML_TimestampLocal)
					// (listEntry.getValTime().getChoice())).getTimestamp().getVal());
				}
			}
		}

		SML_Message smlMessage3 = new SML_Message();
		Assert.assertTrue(smlMessage3.decodeAndCheck(is));
		// System.out.println(Integer.toHexString(smlMessage3.getMessageBody().getTag().getVal()));

	}

}
