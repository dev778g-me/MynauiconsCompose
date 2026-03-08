package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Hand: ImageVector
    get() {
        if (_Hand != null) {
            return _Hand!!
        }
        _Hand = ImageVector.Builder(
            name = "Outline.Hand",
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
                moveTo(17.428f, 11.212f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -2.213f, -3.572f, -2.35f, -3.572f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.857f, 10f)
                verticalLineTo(4.712f)
                curveToRelative(0f, -2.213f, -3.572f, -2.35f, -3.572f, 0f)
                verticalLineToRelative(1.8f)
                moveToRelative(-0.001f, 4.25f)
                verticalLineToRelative(-4.05f)
                curveToRelative(0f, -2.213f, -3.747f, -2.35f, -3.747f, 0f)
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.428f, 9.312f)
                curveToRelative(0f, -2.35f, 3.572f, -2.213f, 3.572f, 0f)
                verticalLineToRelative(4.4f)
                curveToRelative(0f, 6.843f, -9.799f, 9.578f, -14.278f, 5.094f)
                lineToRelative(-3.215f, -3.24f)
                curveTo(2.018f, 13.904f, 4.044f, 10.5f, 6.537f, 13f)
                lineToRelative(1f, 1f)
            }
        }.build()

        return _Hand!!
    }

@Suppress("ObjectPropertyName")
private var _Hand: ImageVector? = null
