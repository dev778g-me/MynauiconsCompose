package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Tool: ImageVector
    get() {
        if (_Tool != null) {
            return _Tool!!
        }
        _Tool = ImageVector.Builder(
            name = "Outline.Tool",
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
                moveTo(21f, 7.86f)
                curveToRelative(0f, -0.43f, -0.056f, -0.849f, -0.161f, -1.246f)
                curveToRelative(-0.092f, -0.349f, -0.522f, -0.432f, -0.776f, -0.177f)
                lineTo(18.34f, 8.16f)
                arcToRelative(1.767f, 1.767f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.5f, -2.5f)
                lineToRelative(1.723f, -1.722f)
                curveToRelative(0.255f, -0.255f, 0.172f, -0.685f, -0.177f, -0.777f)
                arcToRelative(4.86f, 4.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.828f, 6.326f)
                curveToRelative(0.071f, 0.2f, 0.031f, 0.424f, -0.118f, 0.573f)
                lineTo(3.3f, 18.2f)
                curveToRelative(-0.4f, 0.4f, -0.4f, 1.049f, 0f, 1.448f)
                lineTo(4.352f, 20.7f)
                curveToRelative(0.4f, 0.4f, 1.047f, 0.4f, 1.447f, 0f)
                lineToRelative(8.14f, -8.14f)
                curveToRelative(0.15f, -0.15f, 0.374f, -0.19f, 0.573f, -0.119f)
                arcTo(4.86f, 4.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 7.86f)
            }
        }.build()

        return _Tool!!
    }

@Suppress("ObjectPropertyName")
private var _Tool: ImageVector? = null
