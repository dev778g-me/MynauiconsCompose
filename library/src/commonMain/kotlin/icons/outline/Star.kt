package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Star: ImageVector
    get() {
        if (_Star != null) {
            return _Star!!
        }
        _Star = ImageVector.Builder(
            name = "Outline.Star",
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
                moveTo(12.854f, 3.5f)
                arcToRelative(0.979f, 0.979f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.708f, 0f)
                quadToRelative(-0.3f, 0.546f, -0.577f, 1.106f)
                arcToRelative(27f, 27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.48f, 3.656f)
                curveToRelative(-0.139f, 0.431f, -0.551f, 0.73f, -1.023f, 0.743f)
                arcToRelative(29.4f, 29.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.267f, 0.425f)
                curveToRelative(-0.774f, 0.136f, -1.065f, 1.018f, -0.515f, 1.556f)
                quadToRelative(0.188f, 0.185f, 0.38f, 0.365f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.03f, 2.527f)
                curveToRelative(0.367f, 0.269f, 0.518f, 0.73f, 0.378f, 1.152f)
                arcToRelative(27f, 27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.14f, 4.927f)
                curveToRelative(-0.1f, 0.755f, 0.708f, 1.288f, 1.41f, 0.928f)
                arcToRelative(28.6f, 28.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.98f, -2.472f)
                arcToRelative(1.15f, 1.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.356f, 0f)
                arcToRelative(28.5f, 28.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.98f, 2.472f)
                curveToRelative(0.701f, 0.36f, 1.51f, -0.173f, 1.41f, -0.928f)
                quadToRelative(-0.058f, -0.425f, -0.127f, -0.845f)
                arcToRelative(27f, 27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.013f, -4.082f)
                curveToRelative(-0.14f, -0.422f, 0.01f, -0.883f, 0.378f, -1.152f)
                arcToRelative(31.5f, 31.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.41f, -2.892f)
                curveToRelative(0.55f, -0.538f, 0.26f, -1.42f, -0.515f, -1.556f)
                arcToRelative(29f, 29f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.267f, -0.425f)
                arcToRelative(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.023f, -0.743f)
                arcToRelative(27f, 27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.057f, -4.761f)
            }
        }.build()

        return _Star!!
    }

@Suppress("ObjectPropertyName")
private var _Star: ImageVector? = null
