package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChatMessages: ImageVector
    get() {
        if (_ChatMessages != null) {
            return _ChatMessages!!
        }
        _ChatMessages = ImageVector.Builder(
            name = "Outline.ChatMessages",
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
                moveTo(5f, 12f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 7f)
                moveToRelative(-7f, -7f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 4f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.224f, 1.483f)
                curveToRelative(0.272f, 0.88f, 0.076f, 1.86f, -0.099f, 2.784f)
                arcToRelative(0.468f, 0.468f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.592f, 0.539f)
                curveToRelative(0.848f, -0.232f, 1.691f, -0.43f, 2.557f, -0.112f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 21f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -2f)
                moveToRelative(-7f, -7f)
                curveToRelative(0f, -4.685f, 2.875f, -9f, 8f, -9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.532f, 10.7f)
                curveToRelative(-0.476f, 1.326f, 0.037f, 3.102f, 0.337f, 4.568f)
                arcToRelative(0.451f, 0.451f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.584f, 0.526f)
                curveToRelative(-1.312f, -0.41f, -2.852f, -0.986f, -4.085f, -0.466f)
                curveToRelative(-1.334f, 0.562f, -2.736f, 0.672f, -4.2f, 0.672f)
            }
        }.build()

        return _ChatMessages!!
    }

@Suppress("ObjectPropertyName")
private var _ChatMessages: ImageVector? = null
