package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.SearchCheck: ImageVector
    get() {
        if (_SearchCheck != null) {
            return _SearchCheck!!
        }
        _SearchCheck = ImageVector.Builder(
            name = "Outline.SearchCheck",
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
                moveToRelative(9.75f, 11.742f)
                lineToRelative(1.039f, 1.181f)
                curveToRelative(0.095f, 0.109f, 0.267f, 0.1f, 0.351f, -0.016f)
                lineTo(13.25f, 10f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 11.5f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -15f, 0f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 0f)
                moveToRelative(-2.107f, 5.42f)
                lineToRelative(3.08f, 3.08f)
            }
        }.build()

        return _SearchCheck!!
    }

@Suppress("ObjectPropertyName")
private var _SearchCheck: ImageVector? = null
