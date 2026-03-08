package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TelephoneCall: ImageVector
    get() {
        if (_TelephoneCall != null) {
            return _TelephoneCall!!
        }
        _TelephoneCall = ImageVector.Builder(
            name = "Outline.TelephoneCall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.6f, 14.522f)
                curveToRelative(-2.395f, 2.52f, -8.504f, -3.534f, -6.1f, -6.064f)
                curveToRelative(1.468f, -1.545f, -0.19f, -3.31f, -1.108f, -4.609f)
                curveToRelative(-1.723f, -2.435f, -5.504f, 0.927f, -5.39f, 3.066f)
                curveToRelative(0.363f, 6.746f, 7.66f, 14.74f, 14.726f, 14.042f)
                curveToRelative(2.21f, -0.218f, 4.75f, -4.21f, 2.215f, -5.669f)
                curveToRelative(-1.268f, -0.73f, -3.009f, -2.17f, -4.343f, -0.767f)
                moveTo(14f, 3f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 7f)
                moveToRelative(-7f, -3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
            }
        }.build()

        return _TelephoneCall!!
    }

@Suppress("ObjectPropertyName")
private var _TelephoneCall: ImageVector? = null
