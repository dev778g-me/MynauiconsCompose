package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Cookie: ImageVector
    get() {
        if (_Cookie != null) {
            return _Cookie!!
        }
        _Cookie = ImageVector.Builder(
            name = "Outline.Cookie",
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
                moveTo(12.003f, 21f)
                arcToRelative(9.003f, 9.003f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.996f, -8.658f)
                curveToRelative(0.006f, -0.153f, -0.16f, -0.25f, -0.298f, -0.181f)
                curveToRelative(-2.476f, 1.247f, -4.006f, -0.077f, -3.757f, -1.854f)
                arcToRelative(0.23f, 0.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.252f, -0.257f)
                curveToRelative(-2.171f, 0.303f, -3.086f, -1.014f, -2.744f, -2.804f)
                arcToRelative(0.225f, 0.225f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.201f, -0.261f)
                curveToRelative(-2.043f, -0.182f, -2.212f, -2.54f, -1.861f, -3.69f)
                curveToRelative(0.043f, -0.142f, -0.059f, -0.3f, -0.207f, -0.295f)
                arcToRelative(9.003f, 9.003f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.324f, 18f)
                moveTo(15f, 16.354f)
                lineToRelative(0.354f, -0.354f)
                moveTo(10f, 17.354f)
                lineToRelative(0.354f, -0.354f)
                moveTo(8f, 8.354f)
                lineTo(8.353f, 8f)
                moveTo(7f, 13.354f)
                lineTo(7.353f, 13f)
                moveTo(12f, 12.354f)
                lineToRelative(0.354f, -0.354f)
            }
        }.build()

        return _Cookie!!
    }

@Suppress("ObjectPropertyName")
private var _Cookie: ImageVector? = null
