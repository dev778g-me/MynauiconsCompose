package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChatMessages: ImageVector
    get() {
        if (_ChatMessages != null) {
            return _ChatMessages!!
        }
        _ChatMessages = ImageVector.Builder(
            name = "Filled.ChatMessages",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.36f, 19.748f)
                curveToRelative(1.378f, -0.019f, 2.775f, -0.157f, 4.132f, -0.73f)
                curveToRelative(0.421f, -0.177f, 0.945f, -0.187f, 1.585f, -0.068f)
                curveToRelative(0.531f, 0.098f, 1.066f, 0.268f, 1.622f, 0.445f)
                lineToRelative(0.363f, 0.115f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.542f, -1.393f)
                quadToRelative(-0.07f, -0.337f, -0.143f, -0.669f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.308f, -1.616f)
                curveToRelative(-0.101f, -0.753f, -0.092f, -1.386f, 0.085f, -1.88f)
                curveToRelative(0.33f, -0.923f, 0.51f, -1.917f, 0.51f, -2.952f)
                arcTo(8.75f, 8.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 2.25f)
                curveToRelative(-2.794f, 0f, -5.005f, 1.186f, -6.502f, 3.019f)
                curveToRelative(-1.412f, 1.73f, -2.171f, 4.008f, -2.242f, 6.368f)
                arcTo(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.251f, 16f)
                curveToRelative(0f, 0.593f, 0.09f, 1.166f, 0.257f, 1.706f)
                curveToRelative(0.207f, 0.665f, 0.066f, 1.444f, -0.119f, 2.422f)
                arcToRelative(1.218f, 1.218f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.527f, 1.401f)
                curveToRelative(0.86f, -0.235f, 1.485f, -0.357f, 2.1f, -0.13f)
                curveToRelative(0.62f, 0.227f, 1.288f, 0.351f, 1.984f, 0.351f)
                arcToRelative(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.36f, -2.002f)
                moveTo(8f, 11.75f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.466f, 8.24f)
                curveToRelative(-0.934f, -0.343f, -1.831f, -0.207f, -2.589f, -0.02f)
                curveToRelative(0.148f, -0.806f, 0.281f, -1.789f, -0.004f, -2.709f)
                arcTo(4.3f, 4.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.751f, 16f)
                arcToRelative(4.24f, 4.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.7f, -3.4f)
                arcTo(4.23f, 4.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 11.75f)
            }
        }.build()

        return _ChatMessages!!
    }

@Suppress("ObjectPropertyName")
private var _ChatMessages: ImageVector? = null
