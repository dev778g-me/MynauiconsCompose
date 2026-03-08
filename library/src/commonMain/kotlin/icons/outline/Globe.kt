package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Globe: ImageVector
    get() {
        if (_Globe != null) {
            return _Globe!!
        }
        _Globe = ImageVector.Builder(
            name = "Outline.Globe",
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
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -18f)
                moveToRelative(0f, 18f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -18f)
                moveToRelative(0f, 18f)
                curveToRelative(2.761f, 0f, 3.941f, -5.163f, 3.941f, -9f)
                reflectiveCurveTo(14.761f, 3f, 12f, 3f)
                moveToRelative(0f, 18f)
                curveToRelative(-2.761f, 0f, -3.941f, -5.163f, -3.941f, -9f)
                reflectiveCurveTo(9.239f, 3f, 12f, 3f)
                moveTo(3.5f, 9f)
                horizontalLineToRelative(17f)
                moveToRelative(-17f, 6f)
                horizontalLineToRelative(17f)
            }
        }.build()

        return _Globe!!
    }

@Suppress("ObjectPropertyName")
private var _Globe: ImageVector? = null
