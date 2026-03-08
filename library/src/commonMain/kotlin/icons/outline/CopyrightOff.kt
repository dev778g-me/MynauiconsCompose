package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CopyrightOff: ImageVector
    get() {
        if (_CopyrightOff != null) {
            return _CopyrightOff!!
        }
        _CopyrightOff = ImageVector.Builder(
            name = "Outline.CopyrightOff",
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
                moveToRelative(3f, 21f)
                lineToRelative(2.636f, -2.636f)
                moveTo(21f, 3f)
                lineToRelative(-2.636f, 2.636f)
                moveToRelative(0f, 0f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.636f, 18.364f)
                moveTo(18.364f, 5.636f)
                lineTo(5.636f, 18.364f)
                moveToRelative(-2.02f, -3.087f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.277f, 3.615f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 9f)
                curveToRelative(-0.48f, -0.6f, -1.07f, -1f, -2f, -1f)
                curveToRelative(-4.172f, 0f, -4.172f, 8f, 0f, 8f)
                curveToRelative(0.93f, 0f, 1.52f, -0.4f, 2f, -1f)
            }
        }.build()

        return _CopyrightOff!!
    }

@Suppress("ObjectPropertyName")
private var _CopyrightOff: ImageVector? = null
