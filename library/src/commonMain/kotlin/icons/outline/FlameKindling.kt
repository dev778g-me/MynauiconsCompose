package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FlameKindling: ImageVector
    get() {
        if (_FlameKindling != null) {
            return _FlameKindling!!
        }
        _FlameKindling = ImageVector.Builder(
            name = "Outline.FlameKindling",
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
                moveTo(5f, 21.093f)
                curveToRelative(4.46f, -2.23f, 9.12f, -3.955f, 14f, -5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 21.093f)
                curveToRelative(-4.47f, -2.236f, -9.104f, -3.951f, -14f, -5f)
                moveToRelative(7f, -1.012f)
                curveToRelative(2.133f, -0.141f, 4.5f, -1.489f, 5f, -3.988f)
                curveToRelative(0.392f, -1.962f, -0.039f, -5.63f, -2f, -5.518f)
                curveToRelative(-0.342f, 0.02f, -0.736f, 0.164f, -1.184f, 0.468f)
                curveToRelative(-1.197f, 0.81f, -1.55f, -1.269f, -1.816f, -1.966f)
                curveToRelative(-1f, -2.614f, -2.322f, -1.773f, -3.624f, 1.016f)
                curveToRelative(-0.817f, 1.75f, -1.587f, 4.06f, -1.323f, 6.048f)
                curveToRelative(0.322f, 2.425f, 2.518f, 4.102f, 4.947f, 3.94f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.985f, 12.788f)
                curveToRelative(0.847f, -0.056f, 1.787f, -0.591f, 1.985f, -1.584f)
                curveToRelative(0.501f, -2.504f, -1.429f, -1.33f, -1.985f, -2.785f)
                curveToRelative(-0.397f, -1.038f, -0.922f, -0.704f, -1.439f, 0.403f)
                curveToRelative(-0.668f, 1.432f, -0.928f, 4.123f, 1.44f, 3.966f)
            }
        }.build()

        return _FlameKindling!!
    }

@Suppress("ObjectPropertyName")
private var _FlameKindling: ImageVector? = null
