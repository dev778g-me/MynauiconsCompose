package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Label: ImageVector
    get() {
        if (_Label != null) {
            return _Label!!
        }
        _Label = ImageVector.Builder(
            name = "Outline.Label",
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
                moveToRelative(10.98f, 20.194f)
                lineToRelative(-7.298f, -7.298f)
                curveToRelative(-0.37f, -0.37f, -0.58f, -0.87f, -0.587f, -1.392f)
                lineTo(3f, 4.015f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.015f, 3f)
                lineToRelative(7.489f, 0.095f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.392f, 0.587f)
                lineToRelative(7.298f, 7.298f)
                curveToRelative(0.674f, 0.673f, 1.192f, 1.959f, 0.424f, 2.727f)
                lineToRelative(-6.91f, 6.91f)
                curveToRelative(-0.769f, 0.769f, -2.055f, 0.25f, -2.728f, -0.423f)
                moveTo(8.019f, 7.552f)
                lineToRelative(-0.707f, -0.707f)
            }
        }.build()

        return _Label!!
    }

@Suppress("ObjectPropertyName")
private var _Label: ImageVector? = null
