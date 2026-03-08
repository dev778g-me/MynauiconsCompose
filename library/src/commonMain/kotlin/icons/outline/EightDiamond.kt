package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.EightDiamond: ImageVector
    get() {
        if (_EightDiamond != null) {
            return _EightDiamond!!
        }
        _EightDiamond = ImageVector.Builder(
            name = "Outline.EightDiamond",
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
                moveTo(12f, 12f)
                reflectiveCurveToRelative(2.5f, 0.5f, 2.5f, 2f)
                reflectiveCurveToRelative(-1.12f, 2f, -2.5f, 2f)
                reflectiveCurveToRelative(-2.5f, -0.5f, -2.5f, -2f)
                reflectiveCurveToRelative(2.5f, -2f, 2.5f, -2f)
                moveToRelative(0f, 0f)
                reflectiveCurveToRelative(2.5f, -0.5f, 2.5f, -2f)
                reflectiveCurveToRelative(-1.12f, -2f, -2.5f, -2f)
                reflectiveCurveToRelative(-2.5f, 0.5f, -2.5f, 2f)
                reflectiveCurveToRelative(2.5f, 2f, 2.5f, 2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.707f, 10.295f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.41f)
                lineToRelative(7.588f, 7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.41f, 0f)
                lineToRelative(7.588f, -7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.41f)
                lineToRelative(-7.588f, -7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.41f, 0f)
                close()
            }
        }.build()

        return _EightDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _EightDiamond: ImageVector? = null
